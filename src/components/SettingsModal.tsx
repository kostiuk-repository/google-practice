import { useEffect, useRef, useState } from 'react';
import { Download, ExternalLink, Server, ShieldAlert, Upload, X } from 'lucide-react';
import { RUNNER_PRESETS, type ExecutionProvider, type RunnerSettings } from '../types/runner';
import type { DisplaySettings } from '../types/preferences';
import { workspaceStorage, type WorkspaceSnapshot } from '../services/storage';

interface SettingsModalProps {
  open: boolean;
  settings: RunnerSettings;
  displaySettings: DisplaySettings;
  onClose: () => void;
  onSave: (settings: RunnerSettings) => void;
  onSaveDisplay: (settings: DisplaySettings) => void;
}

export function SettingsModal({ open, settings, displaySettings, onClose, onSave, onSaveDisplay }: SettingsModalProps) {
  const [draft, setDraft] = useState(settings);
  const [displayDraft, setDisplayDraft] = useState(displaySettings);
  const [transferMessage, setTransferMessage] = useState('');
  const importRef = useRef<HTMLInputElement>(null);
  useEffect(() => setDraft(settings), [settings, open]);
  useEffect(() => setDisplayDraft(displaySettings), [displaySettings, open]);
  if (!open) return null;

  const selectProvider = (provider: ExecutionProvider) => {
    setDraft({ ...draft, provider, ...RUNNER_PRESETS[provider] });
  };

  const exportProgress = () => {
    const snapshot = workspaceStorage.exportSnapshot();
    const blob = new Blob([JSON.stringify(snapshot, null, 2)], { type: 'application/json' });
    const url = URL.createObjectURL(blob);
    const anchor = document.createElement('a');
    anchor.href = url;
    anchor.download = `google-practice-progress-${snapshot.exportedAt.slice(0, 10)}.json`;
    anchor.click();
    URL.revokeObjectURL(url);
    setTransferMessage(`Exported ${Object.keys(snapshot.entries).length} local records. Runner token was excluded.`);
  };

  const importProgress = async (file: File) => {
    try {
      if (file.size > 5_000_000) throw new Error('Progress file is larger than 5 MB.');
      const snapshot = JSON.parse(await file.text()) as WorkspaceSnapshot;
      if (!window.confirm('Об’єднати прогрес і чернетки з цього файлу з поточними даними та перезавантажити застосунок?')) return;
      workspaceStorage.importSnapshot(snapshot);
      window.location.reload();
    } catch (error) {
      setTransferMessage(error instanceof Error ? error.message : 'Could not import progress file.');
    }
  };

  return (
    <div className="modal-backdrop" role="presentation" onMouseDown={(event) => event.target === event.currentTarget && onClose()}>
      <section className="settings-modal" role="dialog" aria-modal="true" aria-labelledby="settings-title">
        <header>
          <div className="modal-icon"><Server size={18} /></div>
          <div><span className="eyebrow">PLATFORM PREFERENCES</span><h2 id="settings-title">Java Lab settings</h2></div>
          <button className="icon-button" onClick={onClose} aria-label="Закрити"><X size={18} /></button>
        </header>

        <div className="settings-notice">
          <ShieldAlert size={18} />
          {draft.provider === 'wandbox'
            ? <p><strong>Wandbox запускає Java 21 без API key.</strong> Це community-сервіс без SLA, оптимальний для невеликої внутрішньої групи. Код задачі надсилається на wandbox.org.</p>
            : <p><strong>Public Piston requires authorization and currently exposes an older Java runtime.</strong> Використовуйте власний Piston із JDK 21 або виданий token. Значення зберігаються лише у localStorage.</p>}
        </div>

        <section className="display-settings">
          <div><span>READABILITY</span><strong>Розмір тексту</strong><p>Comfortable тепер використовується за замовчуванням. Розмір коду налаштовується окремо.</p></div>
          <div className="field-grid">
            <label className="field-label">
              <span>Interface & documentation</span>
              <select value={displayDraft.uiFontSize} onChange={(event) => setDisplayDraft({ ...displayDraft, uiFontSize: event.target.value as DisplaySettings['uiFontSize'] })}>
                <option value="compact">Compact</option>
                <option value="comfortable">Comfortable</option>
                <option value="large">Large</option>
              </select>
            </label>
            <label className="field-label">
              <span>Code editor · {displayDraft.editorFontSize}px</span>
              <input type="range" min="12" max="20" step="1" value={displayDraft.editorFontSize} onChange={(event) => setDisplayDraft({ ...displayDraft, editorFontSize: Number(event.target.value) })} />
            </label>
          </div>
        </section>

        <label className="field-label">
          <span>Execution provider</span>
          <select value={draft.provider} onChange={(event) => selectProvider(event.target.value as ExecutionProvider)}>
            <option value="wandbox">Wandbox · OpenJDK 21 · no API key</option>
            <option value="piston">Piston · configurable/self-hosted</option>
          </select>
        </label>

        <label className="field-label">
          <span>Execute endpoint</span>
          <input value={draft.endpoint} onChange={(event) => setDraft({ ...draft, endpoint: event.target.value })} />
        </label>
        <div className="field-grid">
          <label className="field-label">
            <span>Java runtime version</span>
            <input value={draft.runtimeVersion} onChange={(event) => setDraft({ ...draft, runtimeVersion: event.target.value })} placeholder={draft.provider === 'wandbox' ? 'openjdk-jdk-21+35' : '* or 21.x'} />
          </label>
          {draft.provider === 'piston' && (
            <label className="field-label">
              <span>Authorization header</span>
              <input value={draft.authHeaderName} onChange={(event) => setDraft({ ...draft, authHeaderName: event.target.value })} />
            </label>
          )}
        </div>
        {draft.provider === 'piston' && (
          <label className="field-label">
            <span>Authorization value</span>
            <input type="password" value={draft.authHeaderValue} onChange={(event) => setDraft({ ...draft, authHeaderValue: event.target.value })} placeholder="Bearer … (залиште порожнім для self-hosted без auth)" />
          </label>
        )}
        <div className="field-grid">
          <label className="field-label">
            <span>Compile timeout, ms</span>
            <input type="number" min="1000" max="60000" value={draft.compileTimeoutMs} onChange={(event) => setDraft({ ...draft, compileTimeoutMs: Number(event.target.value) })} />
          </label>
          <label className="field-label">
            <span>Run timeout, ms</span>
            <input type="number" min="1000" max="60000" value={draft.runTimeoutMs} onChange={(event) => setDraft({ ...draft, runTimeoutMs: Number(event.target.value) })} />
          </label>
        </div>

        <section className="progress-transfer">
          <div><span>LOCAL WORKSPACE</span><strong>Backup progress & code</strong><p>Перенесіть чернетки, завершені задачі, hints і confidence між браузерами. Runner credentials ніколи не експортуються.</p></div>
          <div>
            <button onClick={exportProgress}><Download size={14} /> Export JSON</button>
            <button onClick={() => importRef.current?.click()}><Upload size={14} /> Import JSON</button>
            <input ref={importRef} type="file" accept="application/json,.json" hidden onChange={(event) => {
              const file = event.target.files?.[0];
              if (file) void importProgress(file);
              event.target.value = '';
            }} />
          </div>
          {transferMessage && <output>{transferMessage}</output>}
        </section>

        <footer>
          <a href={draft.provider === 'wandbox' ? 'https://github.com/melpon/wandbox' : 'https://github.com/engineer-man/piston#public-api'} target="_blank" rel="noreferrer"><ExternalLink size={14} /> {draft.provider === 'wandbox' ? 'Wandbox project' : 'Piston API docs'}</a>
          <div><button className="modal-cancel" onClick={onClose}>Cancel</button><button className="modal-save" onClick={() => { onSave(draft); onSaveDisplay(displayDraft); onClose(); }}>Save locally</button></div>
        </footer>
      </section>
    </div>
  );
}
