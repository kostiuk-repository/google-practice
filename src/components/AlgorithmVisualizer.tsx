import { useEffect, useId, useMemo, useRef, useState } from 'react';
import { easeCubicInOut, interpolateNumber, scaleBand, timer } from 'd3';
import {
  ChevronLeft,
  ChevronRight,
  Expand,
  Pause,
  Play,
  RotateCcw,
  X,
} from 'lucide-react';

type VisualizerKind =
  | 'array'
  | 'matrix'
  | 'two-pointers'
  | 'sliding-window'
  | 'binary-search'
  | 'sorting'
  | 'stack'
  | 'queue'
  | 'linked-list'
  | 'tree'
  | 'graph'
  | 'heap'
  | 'dp-table'
  | 'recursion-tree'
  | 'thread-timeline';
type CellValue = string | number;

interface VisualizerStep {
  label: string;
  note?: string;
  pointer?: number;
  pointers?: Record<string, number>;
  visited?: number[];
  active?: number[];
  compare?: number[];
  range?: [number, number];
  values?: CellValue[];
  prediction?: {
    prompt: string;
    options: string[];
    answer: number;
    explanation?: string;
  };
  states?: Record<string, string>;
}

interface VisualizerDefinition {
  type: VisualizerKind;
  title?: string;
  values: CellValue[];
  steps: VisualizerStep[];
  edges?: Array<[number, number]>;
  positions?: Array<[number, number]>;
  columns?: number;
}

interface AlgorithmVisualizerProps {
  source: string;
  theme: 'dark' | 'light';
}

const POINTER_COLORS = ['#38bdf8', '#f59e0b', '#a78bfa', '#34d399'];
const SUPPORTED_TYPES = new Set<VisualizerKind>([
  'array', 'matrix', 'two-pointers', 'sliding-window', 'binary-search', 'sorting', 'stack', 'queue',
  'linked-list', 'tree', 'graph', 'heap', 'dp-table', 'recursion-tree', 'thread-timeline',
]);

function isIndex(value: unknown, length: number): value is number {
  return Number.isInteger(value) && Number(value) >= 0 && Number(value) < length;
}

function parseDefinition(source: string): VisualizerDefinition {
  const raw = JSON.parse(source) as Partial<VisualizerDefinition>;
  if (!raw || typeof raw !== 'object') throw new Error('Visualization must be a JSON object.');
  if (!raw.type || !SUPPORTED_TYPES.has(raw.type)) {
    throw new Error(`Unsupported visualization type: ${raw.type ?? 'missing'}.`);
  }
  if (!Array.isArray(raw.values) || raw.values.length === 0) {
    throw new Error('Field "values" must be a non-empty array.');
  }
  if (raw.values.length > 40 || raw.values.some((value) => !['string', 'number'].includes(typeof value))) {
    throw new Error('"values" supports up to 40 string or number items.');
  }
  if (!Array.isArray(raw.steps) || raw.steps.length === 0) {
    throw new Error('Field "steps" must contain at least one animation step.');
  }

  const length = raw.values.length;
  const steps = raw.steps.map((step, index) => {
    if (!step || typeof step !== 'object' || typeof step.label !== 'string') {
      throw new Error(`Step ${index + 1} must have a text label.`);
    }
    const indexes = [step.pointer, ...Object.values(step.pointers ?? {})]
      .filter((value): value is number => value !== undefined);
    const lists = [step.visited, step.active, step.compare].filter(Boolean) as number[][];
    if (indexes.some((value) => !isIndex(value, length)) || lists.flat().some((value) => !isIndex(value, length))) {
      throw new Error(`Step ${index + 1} contains an index outside the array.`);
    }
    if (step.range && (!isIndex(step.range[0], length) || !isIndex(step.range[1], length) || step.range[0] > step.range[1])) {
      throw new Error(`Step ${index + 1} contains an invalid range.`);
    }
    if (step.values && step.values.length !== length) {
      throw new Error(`Step ${index + 1} must keep the same number of values.`);
    }
    if (step.prediction && (
      typeof step.prediction.prompt !== 'string'
      || !Array.isArray(step.prediction.options)
      || step.prediction.options.length < 2
      || !Number.isInteger(step.prediction.answer)
      || step.prediction.answer < 0
      || step.prediction.answer >= step.prediction.options.length
    )) {
      throw new Error(`Step ${index + 1} contains an invalid prediction question.`);
    }
    return step;
  });

  if (raw.edges && (!Array.isArray(raw.edges) || raw.edges.some((edge) => !Array.isArray(edge) || edge.length !== 2 || edge.some((value) => !isIndex(value, length))))) {
    throw new Error('Every edge must contain two valid value indices.');
  }
  if (raw.positions && (!Array.isArray(raw.positions) || raw.positions.length !== length || raw.positions.some((position) => !Array.isArray(position) || position.length !== 2))) {
    throw new Error('"positions" must contain one [x,y] pair per value.');
  }
  if (raw.columns !== undefined && (!Number.isInteger(raw.columns) || raw.columns < 1 || raw.columns > length)) {
    throw new Error('"columns" must be a positive integer no larger than values.length.');
  }

  return {
    type: raw.type,
    title: raw.title,
    values: raw.values,
    steps,
    edges: raw.edges,
    positions: raw.positions,
    columns: raw.columns,
  };
}

function pointerMap(step: VisualizerStep) {
  return step.pointers ?? (step.pointer === undefined ? {} : { i: step.pointer });
}

function pointerOffset(entries: [string, number][], entryIndex: number) {
  const index = entries[entryIndex][1];
  const peers = entries
    .map(([, value], position) => ({ value, position }))
    .filter((entry) => entry.value === index);
  const rank = peers.findIndex((entry) => entry.position === entryIndex);
  return (rank - (peers.length - 1) / 2) * 18;
}

function useMotionPreference() {
  const [reduced, setReduced] = useState(false);
  useEffect(() => {
    const query = window.matchMedia('(prefers-reduced-motion: reduce)');
    const update = () => setReduced(query.matches);
    update();
    query.addEventListener('change', update);
    return () => query.removeEventListener('change', update);
  }, []);
  return reduced;
}

function structurePositions(definition: VisualizerDefinition, width: number, height: number) {
  if (definition.positions) {
    return definition.positions.map(([x, y]) => ({ x: x * width, y: y * height }));
  }
  if (definition.type === 'graph') {
    const radius = Math.min(width, height) * .34;
    return definition.values.map((_, index) => {
      const angle = -Math.PI / 2 + (Math.PI * 2 * index) / definition.values.length;
      return { x: width / 2 + Math.cos(angle) * radius, y: height / 2 + Math.sin(angle) * radius };
    });
  }
  return definition.values.map((_, index) => {
    const level = Math.floor(Math.log2(index + 1));
    const first = 2 ** level - 1;
    const position = index - first;
    const count = 2 ** level;
    return { x: ((position + 1) * width) / (count + 1), y: 34 + level * 64 };
  });
}

function StructureScene({ definition, step }: { definition: VisualizerDefinition; step: VisualizerStep }) {
  const width = 520;
  const height = Math.max(210, 70 + Math.ceil(Math.log2(definition.values.length + 1)) * 64);
  const positions = structurePositions(definition, width, height);
  const active = new Set([...(step.active ?? []), ...(step.compare ?? [])]);
  const visited = new Set(step.visited ?? []);
  const edges = definition.edges ?? definition.values.flatMap((_, index) => {
    const children: Array<[number, number]> = [];
    if (index * 2 + 1 < definition.values.length) children.push([index, index * 2 + 1]);
    if (index * 2 + 2 < definition.values.length) children.push([index, index * 2 + 2]);
    return children;
  });
  return (
    <div className="algoviz-scroll">
      <svg className="algoviz-svg algoviz-structure" viewBox={`0 0 ${width} ${height}`} width={width} height={height} role="img" aria-label={`${definition.type}: ${step.label}`}>
        <defs><marker id="algoviz-arrow" markerWidth="8" markerHeight="8" refX="7" refY="3" orient="auto"><path d="M0,0 L0,6 L8,3 z" /></marker></defs>
        <g className="structure-edges">{edges.map(([from, to], index) => <line key={`${from}-${to}-${index}`} x1={positions[from].x} y1={positions[from].y} x2={positions[to].x} y2={positions[to].y} markerEnd={definition.type === 'linked-list' ? 'url(#algoviz-arrow)' : undefined} />)}</g>
        {definition.values.map((value, index) => {
          const state = active.has(index) ? 'active' : visited.has(index) ? 'visited' : 'idle';
          return <g key={index} className={`structure-node is-${state}`} transform={`translate(${positions[index].x},${positions[index].y})`}><circle r={22} /><text>{value}</text><text className="node-index" y={34}>{index}</text></g>;
        })}
      </svg>
    </div>
  );
}

function LinkedListScene({ definition, step }: { definition: VisualizerDefinition; step: VisualizerStep }) {
  const width = Math.max(420, definition.values.length * 92 + 40);
  const active = new Set([...(step.active ?? []), ...(step.compare ?? []), ...Object.values(pointerMap(step))]);
  const visited = new Set(step.visited ?? []);
  return (
    <div className="algoviz-scroll">
      <svg className="algoviz-svg algoviz-list" viewBox={`0 0 ${width} 180`} width={width} height={180} role="img" aria-label={`Linked list: ${step.label}`}>
        <defs><marker id="list-arrow" markerWidth="8" markerHeight="8" refX="7" refY="3" orient="auto"><path d="M0,0 L0,6 L8,3 z" /></marker></defs>
        {definition.values.map((value, index) => {
          const nodeX = 42 + index * 92;
          const state = active.has(index) ? 'active' : visited.has(index) ? 'visited' : 'idle';
          return <g key={index} className={`list-node is-${state}`} transform={`translate(${nodeX},52)`}><rect width={60} height={48} rx={7} /><line x1={42} y1={0} x2={42} y2={48} /><text x={21} y={29}>{value}</text><circle cx={49} cy={24} r={3} />{index < definition.values.length - 1 && <line className="list-link" x1={52} y1={24} x2={86} y2={24} markerEnd="url(#list-arrow)" />}</g>;
        })}
        {Object.entries(pointerMap(step)).map(([name, index], pointerIndex) => <g key={name} className="list-pointer" transform={`translate(${72 + index * 92},${116 + pointerIndex * 22})`}><path d="M0,-13 L-5,-4 L5,-4 Z" /><text y={10}>{name}</text></g>)}
        <text className="list-null" x={definition.values.length * 92 + 3} y={81}>null</text>
      </svg>
    </div>
  );
}

function DpTableScene({ definition, step }: { definition: VisualizerDefinition; step: VisualizerStep }) {
  const columns = definition.columns ?? Math.ceil(Math.sqrt(definition.values.length));
  const rows = Math.ceil(definition.values.length / columns);
  const width = Math.max(360, columns * 64 + 40);
  const height = rows * 50 + 38;
  const active = new Set([...(step.active ?? []), ...(step.compare ?? [])]);
  const visited = new Set(step.visited ?? []);
  return <div className="algoviz-scroll"><svg className="algoviz-svg algoviz-dp" viewBox={`0 0 ${width} ${height}`} width={width} height={height} role="img" aria-label={`DP table: ${step.label}`}>{definition.values.map((value, index) => {
    const x = 20 + (index % columns) * 64;
    const y = 18 + Math.floor(index / columns) * 50;
    const state = active.has(index) ? 'active' : visited.has(index) ? 'visited' : 'idle';
    return <g key={index} className={`dp-cell is-${state}`} transform={`translate(${x},${y})`}><rect width={56} height={40} rx={4} /><text x={28} y={25}>{value}</text><text className="dp-index" x={4} y={10}>{Math.floor(index / columns)},{index % columns}</text></g>;
  })}</svg></div>;
}

function MatrixScene({ definition, step, expanded }: {
  definition: VisualizerDefinition;
  step: VisualizerStep;
  expanded: boolean;
}) {
  const values = step.values ?? definition.values;
  const columns = definition.columns ?? Math.ceil(Math.sqrt(values.length));
  const rows = Math.ceil(values.length / columns);
  const cellSize = expanded ? 68 : 54;
  const gap = expanded ? 9 : 7;
  const width = Math.max(360, columns * (cellSize + gap) - gap + 72);
  const height = rows * (cellSize + gap) - gap + 64;
  const active = new Set([
    ...(step.active ?? []),
    ...(step.compare ?? []),
    ...Object.values(pointerMap(step)),
  ]);
  const visited = new Set(step.visited ?? []);

  return (
    <div className="algoviz-scroll">
      <svg
        className="algoviz-svg algoviz-matrix"
        viewBox={`0 0 ${width} ${height}`}
        width={width}
        height={height}
        role="img"
        aria-label={`Matrix: ${step.label}`}
      >
        {Array.from({ length: columns }, (_, column) => (
          <text key={`column-${column}`} className="matrix-axis-label" x={54 + column * (cellSize + gap) + cellSize / 2} y={17}>
            c{column}
          </text>
        ))}
        {Array.from({ length: rows }, (_, row) => (
          <text key={`row-${row}`} className="matrix-axis-label" x={25} y={35 + row * (cellSize + gap) + cellSize / 2}>
            r{row}
          </text>
        ))}
        {values.map((value, index) => {
          const row = Math.floor(index / columns);
          const column = index % columns;
          const state = active.has(index) ? 'active' : visited.has(index) ? 'visited' : 'idle';
          return (
            <g
              key={index}
              className={`matrix-cell is-${state}`}
              transform={`translate(${54 + column * (cellSize + gap)},${27 + row * (cellSize + gap)})`}
            >
              <rect width={cellSize} height={cellSize} rx={7} />
              <text className="matrix-coordinate" x={6} y={12}>{row},{column}</text>
              <text className="matrix-value" x={cellSize / 2} y={cellSize / 2 + 6}>{value}</text>
            </g>
          );
        })}
      </svg>
    </div>
  );
}

function ThreadTimelineScene({ definition, step }: { definition: VisualizerDefinition; step: VisualizerStep }) {
  const width = 520;
  const height = definition.values.length * 52 + 28;
  return <div className="algoviz-scroll"><svg className="algoviz-svg algoviz-threads" viewBox={`0 0 ${width} ${height}`} width={width} height={height} role="img" aria-label={`Thread states: ${step.label}`}>{definition.values.map((thread, index) => {
    const state = step.states?.[String(thread)] ?? 'NEW';
    return <g key={index} className={`thread-row state-${state.toLowerCase()}`} transform={`translate(18,${14 + index * 52})`}><text className="thread-name" y={24}>{thread}</text><line x1={110} x2={490} y1={20} y2={20} /><rect x={125} y={4} width={118} height={32} rx={16} /><text className="thread-state" x={184} y={24}>{state}</text></g>;
  })}</svg></div>;
}

function StackScene({ definition, step }: { definition: VisualizerDefinition; step: VisualizerStep }) {
  const active = new Set([...(step.active ?? []), ...(step.compare ?? [])]);
  const height = Math.max(210, definition.values.length * 43 + 48);
  return <div className="algoviz-scroll"><svg className="algoviz-svg algoviz-stack" viewBox={`0 0 360 ${height}`} width={360} height={height} role="img" aria-label={`Stack: ${step.label}`}><text className="stack-label" x={180} y={20}>TOP</text>{definition.values.map((value, index) => {
    const y = height - 44 - index * 43;
    const state = active.has(index) ? 'active' : (step.visited ?? []).includes(index) ? 'visited' : 'idle';
    return <g key={index} className={`stack-cell is-${state}`} transform={`translate(120,${y})`}><rect width={120} height={36} rx={4} /><text x={60} y={23}>{value}</text></g>;
  })}<path className="stack-base" d={`M105 ${height - 5} H255`} /></svg></div>;
}

function VisualizerCanvas({ definition, expanded }: { definition: VisualizerDefinition; expanded: boolean }) {
  const [stepIndex, setStepIndex] = useState(0);
  const [playing, setPlaying] = useState(false);
  const [speed, setSpeed] = useState(1);
  const [progress, setProgress] = useState(1);
  const [answers, setAnswers] = useState<Record<number, number>>({});
  const previousStepRef = useRef(0);
  const reducedMotion = useMotionPreference();
  const titleId = useId();
  const descriptionId = useId();
  const step = definition.steps[stepIndex];
  const previousStep = definition.steps[previousStepRef.current] ?? step;
  const values = step.values ?? definition.values;
  const cellWidth = expanded ? 68 : 58;
  const gap = expanded ? 12 : 9;
  const horizontalPadding = 30;
  const width = Math.max(360, values.length * (cellWidth + gap) - gap + horizontalPadding * 2);
  const height = 194;
  const x = useMemo(() => scaleBand<number>()
    .domain(values.map((_, index) => index))
    .range([horizontalPadding, width - horizontalPadding])
    .paddingInner(gap / (cellWidth + gap)), [values, width, gap, cellWidth]);

  useEffect(() => {
    if (reducedMotion) {
      setProgress(1);
      previousStepRef.current = stepIndex;
      return;
    }
    setProgress(0);
    const duration = 420 / speed;
    const animation = timer((elapsed) => {
      const next = Math.min(1, elapsed / duration);
      setProgress(easeCubicInOut(next));
      if (next >= 1) {
        previousStepRef.current = stepIndex;
        animation.stop();
      }
    });
    return () => animation.stop();
  }, [stepIndex, speed, reducedMotion]);

  useEffect(() => {
    if (!playing) return;
    if (step.prediction && answers[stepIndex] === undefined) {
      setPlaying(false);
      return;
    }
    if (stepIndex >= definition.steps.length - 1) {
      setPlaying(false);
      return;
    }
    const timeout = window.setTimeout(() => setStepIndex((current) => current + 1), 1_250 / speed);
    return () => window.clearTimeout(timeout);
  }, [playing, stepIndex, speed, definition.steps.length, step.prediction, answers]);

  const goTo = (next: number) => {
    previousStepRef.current = stepIndex;
    setStepIndex(Math.max(0, Math.min(definition.steps.length - 1, next)));
  };
  const reset = () => {
    setPlaying(false);
    setAnswers({});
    goTo(0);
  };

  const currentPointers = pointerMap(step);
  const previousPointers = pointerMap(previousStep);
  const pointerEntries = Object.entries(currentPointers) as [string, number][];
  const previousPointerEntries = Object.entries(previousPointers) as [string, number][];
  const active = new Set([...(step.active ?? []), ...(step.compare ?? []), ...Object.values(currentPointers)]);
  const visited = new Set(step.visited ?? []);
  const range = step.range;
  const previousRange = previousStep.range ?? range;
  const targetRangeX = range ? x(range[0]) ?? 0 : 0;
  const targetRangeEnd = range ? (x(range[1]) ?? 0) + x.bandwidth() : 0;
  const previousRangeX = previousRange ? x(previousRange[0]) ?? targetRangeX : targetRangeX;
  const previousRangeEnd = previousRange ? (x(previousRange[1]) ?? 0) + x.bandwidth() : targetRangeEnd;
  const rangeX = interpolateNumber(previousRangeX, targetRangeX)(progress);
  const rangeEnd = interpolateNumber(previousRangeEnd, targetRangeEnd)(progress);
  const predictionAnswer = answers[stepIndex];
  const canAdvance = !step.prediction || predictionAnswer !== undefined;

  return (
    <div className="algoviz-body">
      <div className="algoviz-stage" role="group" aria-label="Animated algorithm state">
        {definition.type === 'matrix' ? <MatrixScene definition={definition} step={step} expanded={expanded} />
          : definition.type === 'linked-list' ? <LinkedListScene definition={definition} step={step} />
          : definition.type === 'stack' ? <StackScene definition={definition} step={step} />
          : definition.type === 'dp-table' ? <DpTableScene definition={definition} step={step} />
          : definition.type === 'thread-timeline' ? <ThreadTimelineScene definition={definition} step={step} />
          : ['tree', 'graph', 'heap', 'recursion-tree'].includes(definition.type)
            ? <StructureScene definition={definition} step={step} />
            : <div className="algoviz-scroll">
          <svg
            className="algoviz-svg"
            viewBox={`0 0 ${width} ${height}`}
            width={width}
            height={height}
            role="img"
            aria-labelledby={`${titleId} ${descriptionId}`}
          >
            <title id={titleId}>{definition.title ?? 'Array algorithm visualization'}</title>
            <desc id={descriptionId}>{`Step ${stepIndex + 1}: ${step.label}. Values: ${values.join(', ')}.`}</desc>

            {range && (
              <g className="algoviz-range">
                <rect x={rangeX - 5} y={39} width={rangeEnd - rangeX + 10} height={75} rx={9} />
                <text x={(rangeX + rangeEnd) / 2} y={32}>active range</text>
              </g>
            )}

            {values.map((value, index) => {
              const position = x(index) ?? 0;
              const state = active.has(index) ? 'active' : visited.has(index) ? 'visited' : 'idle';
              return (
                <g key={index} className={`algoviz-cell is-${state}`} transform={`translate(${position}, 48)`}>
                  <text className="algoviz-index" x={x.bandwidth() / 2} y={-13}>{index}</text>
                  <rect width={x.bandwidth()} height={58} rx={7} />
                  <text className="algoviz-value" x={x.bandwidth() / 2} y={35}>{value}</text>
                  {visited.has(index) && !active.has(index) && <circle className="algoviz-visited-dot" cx={x.bandwidth() / 2} cy={69} r={2.5} />}
                </g>
              );
            })}

            {pointerEntries.map(([name, index], pointerIndex) => {
              const previousIndex = previousPointers[name] ?? index;
              const previousEntryIndex = previousPointerEntries.findIndex(([candidate]) => candidate === name);
              const fromOffset = previousEntryIndex >= 0 ? pointerOffset(previousPointerEntries, previousEntryIndex) : 0;
              const toOffset = pointerOffset(pointerEntries, pointerIndex);
              const from = (x(previousIndex) ?? 0) + x.bandwidth() / 2 + fromOffset;
              const to = (x(index) ?? 0) + x.bandwidth() / 2 + toOffset;
              const pointerX = interpolateNumber(from, to)(progress);
              const color = POINTER_COLORS[pointerIndex % POINTER_COLORS.length];
              return (
                <g key={name} className="algoviz-pointer" transform={`translate(${pointerX}, 0)`} style={{ color }}>
                  <path d="M 0 119 L -6 130 L 6 130 Z" />
                  <rect x={-20} y={134} width={40} height={22} rx={11} />
                  <text y={149}>{name}</text>
                </g>
              );
            })}
          </svg>
        </div>}
      </div>

      <div className="algoviz-narration" aria-live="polite">
        <div><span>STEP {stepIndex + 1}/{definition.steps.length}</span><strong>{step.label}</strong></div>
        {step.note && <p>{step.note}</p>}
      </div>

      {step.prediction && (
        <section className="algoviz-prediction">
          <header><span>PREDICT BEFORE REVEAL</span><strong>{step.prediction.prompt}</strong></header>
          <div className="prediction-options">
            {step.prediction.options.map((option, index) => {
              const answered = predictionAnswer !== undefined;
              const correct = index === step.prediction!.answer;
              const selected = predictionAnswer === index;
              const className = answered && correct ? 'is-correct' : answered && selected ? 'is-wrong' : '';
              return <button key={option} className={className} disabled={answered} onClick={() => setAnswers((current) => ({ ...current, [stepIndex]: index }))}>{option}</button>;
            })}
          </div>
          {predictionAnswer !== undefined && (
            <p className={predictionAnswer === step.prediction.answer ? 'prediction-feedback is-correct' : 'prediction-feedback is-wrong'}>
              {predictionAnswer === step.prediction.answer ? 'Правильно. ' : 'Не зовсім. '}
              {step.prediction.explanation ?? 'Тепер відкрийте наступний крок і порівняйте зміну стану зі своїм прогнозом.'}
            </p>
          )}
        </section>
      )}

      <div className="algoviz-controls">
        <button onClick={reset} title="Повернутися до першого кроку" aria-label="Reset visualization"><RotateCcw size={14} /></button>
        <button onClick={() => goTo(stepIndex - 1)} disabled={stepIndex === 0} title="Попередній крок" aria-label="Previous step"><ChevronLeft size={16} /></button>
        <button className="algoviz-play" onClick={() => {
          if (stepIndex === definition.steps.length - 1) goTo(0);
          setPlaying((value) => !value);
        }} disabled={!canAdvance && stepIndex < definition.steps.length - 1}
        title={!canAdvance ? 'Спочатку зробіть прогноз' : undefined}
        aria-label={playing ? 'Pause animation' : 'Play animation'}>
          {playing ? <Pause size={14} /> : <Play size={14} />}{playing ? 'Pause' : 'Play'}
        </button>
        <button onClick={() => goTo(stepIndex + 1)} disabled={stepIndex === definition.steps.length - 1 || !canAdvance} title={canAdvance ? 'Наступний крок' : 'Спочатку зробіть прогноз'} aria-label="Next step"><ChevronRight size={16} /></button>
        <label className="algoviz-speed">
          <span>Speed</span>
          <select value={speed} onChange={(event) => setSpeed(Number(event.target.value))}>
            <option value={0.5}>0.5×</option>
            <option value={1}>1×</option>
            <option value={1.5}>1.5×</option>
            <option value={2}>2×</option>
          </select>
        </label>
      </div>

      <details className="algoviz-text-fallback">
        <summary>Текстова версія</summary>
        <p>{step.label}{step.note ? ` — ${step.note}` : ''}</p>
        <table>
          <thead><tr><th>Індекс</th>{values.map((_, index) => <th key={index}>{index}</th>)}</tr></thead>
          <tbody><tr><th>Значення</th>{values.map((value, index) => <td key={index}>{value}</td>)}</tr></tbody>
        </table>
      </details>
    </div>
  );
}

export function AlgorithmVisualizer({ source, theme }: AlgorithmVisualizerProps) {
  const [expanded, setExpanded] = useState(false);
  const parsed = useMemo(() => {
    try {
      return { definition: parseDefinition(source), error: '' };
    } catch (error) {
      return { definition: null, error: error instanceof Error ? error.message : 'Invalid visualization definition.' };
    }
  }, [source]);

  useEffect(() => {
    if (!expanded) return;
    const previousOverflow = document.body.style.overflow;
    const closeOnEscape = (event: KeyboardEvent) => {
      if (event.key === 'Escape') setExpanded(false);
    };
    document.body.style.overflow = 'hidden';
    window.addEventListener('keydown', closeOnEscape);
    return () => {
      document.body.style.overflow = previousOverflow;
      window.removeEventListener('keydown', closeOnEscape);
    };
  }, [expanded]);

  if (!parsed.definition) {
    return (
      <div className="algoviz-frame is-error">
        <div className="algoviz-header"><span>ALGORITHM VISUALIZATION</span></div>
        <p>Не вдалося відобразити анімацію: {parsed.error}</p>
        <pre><code>{source}</code></pre>
      </div>
    );
  }

  const content = <VisualizerCanvas key={expanded ? 'expanded' : 'inline'} definition={parsed.definition} expanded={expanded} />;
  return (
    <div className="algoviz-frame" data-theme={theme}>
      <div className="algoviz-header">
        <div><span>INTERACTIVE · {parsed.definition.type.replace('-', ' ')}</span><strong>{parsed.definition.title ?? 'Algorithm walkthrough'}</strong></div>
        <button onClick={() => setExpanded(true)} title="Відкрити на весь екран" aria-label="Open visualization fullscreen"><Expand size={14} /></button>
      </div>
      {content}
      {expanded && (
        <div className="algoviz-modal" role="dialog" aria-modal="true" aria-label="Algorithm visualization fullscreen">
          <button className="algoviz-close" onClick={() => setExpanded(false)} aria-label="Закрити"><X size={20} /></button>
          <div className="algoviz-modal-content">
            <div className="algoviz-modal-title"><span>INTERACTIVE WALKTHROUGH</span><strong>{parsed.definition.title ?? 'Algorithm visualization'}</strong></div>
            {content}
          </div>
        </div>
      )}
    </div>
  );
}
