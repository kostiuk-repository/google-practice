import { useMemo, useState } from 'react';
import {
  BookOpenText,
  CheckCircle2,
  ChevronDown,
  ChevronRight,
  Circle,
  Dumbbell,
  FileText,
  List,
} from 'lucide-react';
import type { PracticeTask, TopicContent, TopicMeta } from '../types/catalog';
import { DocViewer } from './DocViewer';

type LeftTab = 'topics' | 'guide' | 'task-doc';

interface TopicNavigatorProps {
  topics: TopicMeta[];
  activeTopic: TopicContent;
  activeTask: PracticeTask;
  completed: Set<string>;
  search: string;
  theme: 'dark' | 'light';
  onSelectTopic: (topicId: string) => void;
  onSelectTask: (taskId: string) => void;
}

const difficultyLabels = { Easy: 'Easy', Medium: 'Medium', Hard: 'Hard' } as const;

export function TopicNavigator({
  topics,
  activeTopic,
  activeTask,
  completed,
  search,
  theme,
  onSelectTopic,
  onSelectTask,
}: TopicNavigatorProps) {
  const [tab, setTab] = useState<LeftTab>('topics');
  const [expanded, setExpanded] = useState(() => new Set([activeTopic.id]));
  const [guideSource, setGuideSource] = useState<'guide' | 'notes'>('guide');
  const normalizedSearch = search.trim().toLocaleLowerCase();

  const visibleTopics = useMemo(() => {
    if (!normalizedSearch) return topics;
    const activeMatches = activeTopic.tasks.some((task) => task.title.toLocaleLowerCase().includes(normalizedSearch));
    return topics.filter((topic) =>
      topic.title.toLocaleLowerCase().includes(normalizedSearch) ||
      topic.id.toLocaleLowerCase().includes(normalizedSearch) ||
      (topic.id === activeTopic.id && activeMatches));
  }, [topics, activeTopic, normalizedSearch]);

  const toggleTopic = (topicId: string) => {
    setExpanded((previous) => {
      const next = new Set(previous);
      if (next.has(topicId)) next.delete(topicId);
      else next.add(topicId);
      return next;
    });
    if (topicId !== activeTopic.id) onSelectTopic(topicId);
  };

  const renderTasks = () => (
    <div className="topic-tree">
      <div className="track-label">DATA STRUCTURES & ALGORITHMS</div>
      {visibleTopics.map((topic) => {
        const isActive = topic.id === activeTopic.id;
        const isExpanded = expanded.has(topic.id) || isActive || Boolean(normalizedSearch);
        const topicTasks = isActive
          ? activeTopic.tasks.filter((task) => !normalizedSearch || task.title.toLocaleLowerCase().includes(normalizedSearch))
          : [];
        const topicDone = isActive && activeTopic.tasks.length > 0 && activeTopic.tasks.every((task) => completed.has(task.id));
        return (
          <div className="topic-node" key={topic.id}>
            <button className={isActive ? 'topic-row is-active' : 'topic-row'} onClick={() => toggleTopic(topic.id)}>
              {isExpanded ? <ChevronDown size={14} /> : <ChevronRight size={14} />}
              <span className="topic-number">{String(topic.number).padStart(2, '0')}</span>
              <span className="topic-title">{topic.title}</span>
              {topicDone ? <CheckCircle2 size={14} className="complete-icon" /> : <span className="task-count">{topic.taskCount}</span>}
            </button>
            {isExpanded && isActive && (
              <div className="task-tree">
                {(['Easy', 'Medium', 'Hard'] as const).map((difficulty) => {
                  const tasks = topicTasks.filter((task) => task.difficulty === difficulty);
                  if (!tasks.length) return null;
                  return (
                    <div key={difficulty} className="difficulty-group">
                      <div className={`difficulty-heading difficulty-${difficulty.toLocaleLowerCase()}`}>
                        {difficultyLabels[difficulty]} <span>{tasks.length}</span>
                      </div>
                      {tasks.map((task) => (
                        <button
                          key={task.id}
                          className={task.id === activeTask.id ? 'task-row is-active' : 'task-row'}
                          onClick={() => onSelectTask(task.id)}
                        >
                          {completed.has(task.id) ? <CheckCircle2 size={13} className="complete-icon" /> : <Circle size={13} />}
                          <span className="task-row-title">{String(task.order).padStart(2, '0')}. {task.title}</span>
                          <span className="task-drill-count" title={`${task.iterations.length - 1} додаткових drill-задач`}>
                            <Dumbbell size={10} /> {task.iterations.length - 1}
                          </span>
                        </button>
                      ))}
                    </div>
                  );
                })}
              </div>
            )}
          </div>
        );
      })}
    </div>
  );

  return (
    <section className="learning-panel">
      <div className="left-panel-tabs" role="tablist">
        <button className={tab === 'topics' ? 'is-active' : ''} onClick={() => setTab('topics')}><List size={14} /> Topics</button>
        <button className={tab === 'guide' ? 'is-active' : ''} onClick={() => setTab('guide')}><BookOpenText size={14} /> Guide</button>
        <button className={tab === 'task-doc' ? 'is-active' : ''} onClick={() => setTab('task-doc')}><FileText size={14} /> Task.md</button>
      </div>
      {tab === 'topics' && renderTasks()}
      {tab === 'guide' && (
        <div className="left-doc-wrap">
          <div className="doc-source-toggle">
            <button className={guideSource === 'guide' ? 'is-active' : ''} onClick={() => setGuideSource('guide')}>Deep guide</button>
            <button className={guideSource === 'notes' ? 'is-active' : ''} onClick={() => setGuideSource('notes')}>Original notes</button>
          </div>
          <DocViewer
            markdown={guideSource === 'guide' ? activeTopic.guide : activeTopic.notes}
            theme={theme}
            title={`${String(activeTopic.number).padStart(2, '0')} · ${activeTopic.title}`}
          />
        </div>
      )}
      {tab === 'task-doc' && (
        <div className="left-doc-wrap">
          <DocViewer markdown={activeTask.doc} theme={theme} title={activeTask.title} />
        </div>
      )}
    </section>
  );
}
