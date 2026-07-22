import {
  BookOpen,
  CloudOff,
  Moon,
  Search,
  Settings,
  Sun,
} from 'lucide-react';

interface HeaderProps {
  activeTopic: string;
  completedModules: number;
  completedTasks: number;
  totalTasks: number;
  theme: 'dark' | 'light';
  search: string;
  onSearch: (value: string) => void;
  onToggleTheme: () => void;
  onOpenSettings: () => void;
}

export function Header({
  activeTopic,
  completedModules,
  completedTasks,
  totalTasks,
  theme,
  search,
  onSearch,
  onToggleTheme,
  onOpenSettings,
}: HeaderProps) {
  const percentage = totalTasks ? Math.round((completedTasks / totalTasks) * 100) : 0;

  return (
    <header className="app-header">
      <div className="brand-block">
        <div className="brand-mark"><BookOpen size={18} /></div>
        <div>
          <strong>Java Lab</strong>
          <span>DSA · Concurrency · Java 21</span>
        </div>
      </div>

      <div className="header-context">
        <span className="eyebrow">ACTIVE TOPIC</span>
        <strong>{activeTopic || 'Loading curriculum…'}</strong>
      </div>

      <div className="header-progress" title={`${completedTasks} із ${totalTasks} задач завершено`}>
        <div className="header-progress-row">
          <span>Course progress</span>
          <strong>{completedModules}/20</strong>
        </div>
        <div className="progress-track"><span style={{ width: `${percentage}%` }} /></div>
      </div>

      <label className="quick-search">
        <Search size={15} />
        <input
          aria-label="Пошук тем і задач"
          value={search}
          onChange={(event) => onSearch(event.target.value)}
          placeholder="Search 320 tasks…"
        />
        <kbd>/</kbd>
      </label>

      <div className="local-badge" title="Прогрес і код зберігаються лише в цьому браузері">
        <CloudOff size={14} />
        <span>Local-first</span>
      </div>

      <button className="icon-button" onClick={onToggleTheme} aria-label="Перемкнути тему">
        {theme === 'dark' ? <Sun size={17} /> : <Moon size={17} />}
      </button>
      <button className="icon-button" onClick={onOpenSettings} aria-label="Налаштування платформи">
        <Settings size={17} />
      </button>
    </header>
  );
}
