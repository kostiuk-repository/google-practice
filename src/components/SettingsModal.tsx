import { useEffect, useState } from 'react';
import { ExternalLink, Server, ShieldAlert, X } from 'lucide-react';
import { RUNNER_PRESETS, type ExecutionProvider, type RunnerSettings } from '../types/runner';

interface SettingsModalProps {
  open: boolean;
  settings: RunnerSettings;
  onClose: () => void;
  onSave: (settings: RunnerSettings) => void;
}

export function SettingsModal({ open, settings, onClose, onSave }: SettingsModalProps) {
  const [draft, setDraft] = useState(settings);
  useEffect(() => setDraft(settings), [settings, open]);
  if (!open) return null;

  const selectProvider = (provider: ExecutionProvider) => {
    setDraft({ ...draft, provider, ...RUNNER_PRESETS[provider] });
  };

  return (
    <div className="modal-backdrop" role="presentation" onMouseDown={(event) => event.target === event.currentTarget && onClose()}>
      <section className="settings-modal" role="dialog" aria-modal="true" aria-labelledby="settings-title">
        <header>
          <div className="modal-icon"><Server size={18} /></div>
          <div><span className="eyebrow">REMOTE EXECUTION</span><h2 id="settings-title">Java runner settings</h2></div>
          <button className="icon-button" onClick={onClose} aria-label="Закрити"><X size={18} /></button>
        </header>

        <div className="settings-notice">
          <ShieldAlert size={18} />
          {draft.provider === 'wandbox'
            ? <p><strong>Wandbox запускає Java 21 без API key.</strong> Це community-сервіс без SLA, оптимальний для невеликої внутрішньої групи. Код задачі надсилається на wandbox.org.</p>
            : <p><strong>Public Piston requires authorization and currently exposes an older Java runtime.</strong> Використовуйте власний Piston із JDK 21 або виданий token. Значення зберігаються лише у localStorage.</p>}
        </div>

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

        <footer>
          <a href={draft.provider === 'wandbox' ? 'https://github.com/melpon/wandbox' : 'https://github.com/engineer-man/piston#public-api'} target="_blank" rel="noreferrer"><ExternalLink size={14} /> {draft.provider === 'wandbox' ? 'Wandbox project' : 'Piston API docs'}</a>
          <div><button className="modal-cancel" onClick={onClose}>Cancel</button><button className="modal-save" onClick={() => { onSave(draft); onClose(); }}>Save locally</button></div>
        </footer>
      </section>
    </div>
  );
}
