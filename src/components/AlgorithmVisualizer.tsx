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

type VisualizerKind = 'array' | 'two-pointers' | 'sliding-window' | 'binary-search';
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
}

interface VisualizerDefinition {
  type: VisualizerKind;
  title?: string;
  values: CellValue[];
  steps: VisualizerStep[];
}

interface AlgorithmVisualizerProps {
  source: string;
  theme: 'dark' | 'light';
}

const POINTER_COLORS = ['#38bdf8', '#f59e0b', '#a78bfa', '#34d399'];
const SUPPORTED_TYPES = new Set<VisualizerKind>(['array', 'two-pointers', 'sliding-window', 'binary-search']);

function isIndex(value: unknown, length: number): value is number {
  return Number.isInteger(value) && Number(value) >= 0 && Number(value) < length;
}

function parseDefinition(source: string): VisualizerDefinition {
  const raw = JSON.parse(source) as Partial<VisualizerDefinition>;
  if (!raw || typeof raw !== 'object') throw new Error('Visualization must be a JSON object.');
  if (!raw.type || !SUPPORTED_TYPES.has(raw.type)) {
    throw new Error('Supported types: array, two-pointers, sliding-window, binary-search.');
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
    return step;
  });

  return { type: raw.type, title: raw.title, values: raw.values, steps };
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

function VisualizerCanvas({ definition, expanded }: { definition: VisualizerDefinition; expanded: boolean }) {
  const [stepIndex, setStepIndex] = useState(0);
  const [playing, setPlaying] = useState(false);
  const [speed, setSpeed] = useState(1);
  const [progress, setProgress] = useState(1);
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
    if (stepIndex >= definition.steps.length - 1) {
      setPlaying(false);
      return;
    }
    const timeout = window.setTimeout(() => setStepIndex((current) => current + 1), 1_250 / speed);
    return () => window.clearTimeout(timeout);
  }, [playing, stepIndex, speed, definition.steps.length]);

  const goTo = (next: number) => {
    previousStepRef.current = stepIndex;
    setStepIndex(Math.max(0, Math.min(definition.steps.length - 1, next)));
  };
  const reset = () => {
    setPlaying(false);
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

  return (
    <div className="algoviz-body">
      <div className="algoviz-stage" role="group" aria-label="Animated algorithm state">
        <div className="algoviz-scroll">
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
        </div>
      </div>

      <div className="algoviz-narration" aria-live="polite">
        <div><span>STEP {stepIndex + 1}/{definition.steps.length}</span><strong>{step.label}</strong></div>
        {step.note && <p>{step.note}</p>}
      </div>

      <div className="algoviz-controls">
        <button onClick={reset} title="Повернутися до першого кроку" aria-label="Reset visualization"><RotateCcw size={14} /></button>
        <button onClick={() => goTo(stepIndex - 1)} disabled={stepIndex === 0} title="Попередній крок" aria-label="Previous step"><ChevronLeft size={16} /></button>
        <button className="algoviz-play" onClick={() => {
          if (stepIndex === definition.steps.length - 1) goTo(0);
          setPlaying((value) => !value);
        }} aria-label={playing ? 'Pause animation' : 'Play animation'}>
          {playing ? <Pause size={14} /> : <Play size={14} />}{playing ? 'Pause' : 'Play'}
        </button>
        <button onClick={() => goTo(stepIndex + 1)} disabled={stepIndex === definition.steps.length - 1} title="Наступний крок" aria-label="Next step"><ChevronRight size={16} /></button>
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
