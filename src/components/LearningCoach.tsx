import { useMemo } from 'react';
import { BrainCircuit, Check, Eye, Lightbulb, ShieldQuestion, Target, TriangleAlert } from 'lucide-react';
import { getLearningPattern } from '../data/learningPatterns';
import type { LearningRecord } from '../types/learning';

interface LearningCoachProps {
  topicId: string;
  taskTitle: string;
  taskDoc: string;
  record: LearningRecord;
  onRevealHint: (count: number) => void;
  onConfidenceChange: (confidence: 1 | 2 | 3) => void;
}

function extractTechnique(markdown: string) {
  return markdown.match(/##\s+Техніка:\s*(.+)/i)?.[1]?.trim()
    ?? markdown.match(/\*\*Суть:\*\*\s*(.+)/i)?.[1]?.trim()
    ?? '';
}

export function LearningCoach({
  topicId,
  taskTitle,
  taskDoc,
  record,
  onRevealHint,
  onConfidenceChange,
}: LearningCoachProps) {
  const pattern = getLearningPattern(topicId);
  const technique = useMemo(() => extractTechnique(taskDoc), [taskDoc]);
  const nextHint = Math.min(record.hintsRevealed + 1, pattern.hints.length);

  return (
    <div className="learning-coach">
      <section className="coach-hero">
        <span><BrainCircuit size={15} /> PROBLEM RECOGNITION</span>
        <h3>{technique || pattern.tool}</h3>
        <p>{taskTitle}</p>
        <code>{pattern.complexity}</code>
      </section>

      <div className="coach-grid">
        <section className="coach-card coach-signals">
          <h4><Target size={14} /> Сигнали в умові</h4>
          <ul>{pattern.signals.map((signal) => <li key={signal}><Check size={11} />{signal}</li>)}</ul>
        </section>
        <section className="coach-card coach-avoid">
          <h4><TriangleAlert size={14} /> Коли не застосовувати</h4>
          <ul>{pattern.avoidWhen.map((signal) => <li key={signal}>{signal}</li>)}</ul>
        </section>
      </div>

      <section className="coach-hints">
        <header><div><Lightbulb size={15} /><span>PROGRESSIVE HINTS</span></div><code>{record.hintsRevealed}/{pattern.hints.length}</code></header>
        {pattern.hints.map((hint, index) => index < record.hintsRevealed ? (
          <div className="coach-hint" key={hint}><span>{index + 1}</span><p>{hint}</p></div>
        ) : null)}
        {record.hintsRevealed < pattern.hints.length && (
          <button className="reveal-hint" onClick={() => onRevealHint(nextHint)}>
            <Eye size={14} /> Відкрити підказку {nextHint}
          </button>
        )}
        {record.hintsRevealed === 0 && <p className="coach-hint-empty">Спочатку спробуйте назвати pattern самостійно. Підказки відкриваються по одній.</p>}
      </section>

      <section className="coach-confidence">
        <div><ShieldQuestion size={15} /><span>Наскільки впевнено ви впізнаєте цей тип наступного разу?</span></div>
        <div>
          <button className={record.confidence === 1 ? 'is-active' : ''} onClick={() => onConfidenceChange(1)}>Ще плутаюсь</button>
          <button className={record.confidence === 2 ? 'is-active' : ''} onClick={() => onConfidenceChange(2)}>Майже</button>
          <button className={record.confidence === 3 ? 'is-active' : ''} onClick={() => onConfidenceChange(3)}>Впевнено</button>
        </div>
      </section>

      <footer className="coach-stats">
        <span>Attempts <strong>{record.attempts}</strong></span>
        <span>Status <strong className={record.passed ? 'success-text' : ''}>{record.passed ? 'Passed' : 'In progress'}</strong></span>
      </footer>
    </div>
  );
}
