import { useEffect, useRef, useState } from 'react';
import { basicSetup } from 'codemirror';
import { autocompletion, closeBrackets } from '@codemirror/autocomplete';
import { defaultKeymap, history, historyKeymap, indentWithTab } from '@codemirror/commands';
import { bracketMatching, indentOnInput, syntaxTree } from '@codemirror/language';
import { java } from '@codemirror/lang-java';
import { lintGutter, linter, type Diagnostic } from '@codemirror/lint';
import { highlightSelectionMatches, searchKeymap } from '@codemirror/search';
import { Compartment, EditorState } from '@codemirror/state';
import { oneDark } from '@codemirror/theme-one-dark';
import { EditorView, keymap, lineNumbers } from '@codemirror/view';
import { Check, Clipboard, RotateCcw } from 'lucide-react';
import type { Iteration } from '../types/catalog';

interface EditorProps {
  code: string;
  fileName: string;
  iterations: Iteration[];
  activeIterationId: string;
  theme: 'dark' | 'light';
  saved: boolean;
  onChange: (code: string) => void;
  onIterationChange: (iterationId: string) => void;
  onReset: () => void;
  onRunTests: () => void;
}

const themeCompartment = new Compartment();

const lightTheme = EditorView.theme({
  '&': { color: '#17212b', backgroundColor: '#fbfcfd' },
  '.cm-content': { caretColor: '#0077a8' },
  '.cm-gutters': { backgroundColor: '#f3f5f7', color: '#7a8792', border: 'none' },
  '&.cm-focused .cm-cursor': { borderLeftColor: '#0077a8' },
  '.cm-activeLine': { backgroundColor: '#edf5f9' },
  '.cm-activeLineGutter': { backgroundColor: '#e5f0f5' },
});

function javaStructuralDiagnostics(view: EditorView): Diagnostic[] {
  const diagnostics: Diagnostic[] = [];
  const cursor = syntaxTree(view.state).cursor();
  do {
    if (cursor.type.isError) {
      const from = Math.min(cursor.from, view.state.doc.length);
      const to = Math.max(from, Math.min(cursor.to || from + 1, view.state.doc.length));
      diagnostics.push({
        from,
        to,
        severity: 'error',
        message: 'Незавершена або неочікувана Java-конструкція.',
        source: 'Java parser',
      });
    }
  } while (cursor.next());
  return diagnostics;
}

export function Editor({
  code,
  fileName,
  iterations,
  activeIterationId,
  theme,
  saved,
  onChange,
  onIterationChange,
  onReset,
  onRunTests,
}: EditorProps) {
  const hostRef = useRef<HTMLDivElement>(null);
  const editorRef = useRef<EditorView | null>(null);
  const changeRef = useRef(onChange);
  const runRef = useRef(onRunTests);
  const [copied, setCopied] = useState(false);

  changeRef.current = onChange;
  runRef.current = onRunTests;

  useEffect(() => {
    if (!hostRef.current) return;
    const state = EditorState.create({
      doc: code,
      extensions: [
        basicSetup,
        lineNumbers(),
        history(),
        indentOnInput(),
        bracketMatching(),
        closeBrackets(),
        autocompletion(),
        highlightSelectionMatches(),
        java(),
        lintGutter(),
        linter(javaStructuralDiagnostics, { delay: 350 }),
        keymap.of([
          ...defaultKeymap,
          ...historyKeymap,
          ...searchKeymap,
          indentWithTab,
          { key: 'Mod-Enter', run: () => { runRef.current(); return true; } },
        ]),
        themeCompartment.of(theme === 'dark' ? oneDark : lightTheme),
        EditorView.lineWrapping,
        EditorView.updateListener.of((update) => {
          if (update.docChanged) changeRef.current(update.state.doc.toString());
        }),
      ],
    });
    editorRef.current = new EditorView({ state, parent: hostRef.current });
    return () => {
      editorRef.current?.destroy();
      editorRef.current = null;
    };
  }, []);

  useEffect(() => {
    const editor = editorRef.current;
    if (!editor || editor.state.doc.toString() === code) return;
    editor.dispatch({ changes: { from: 0, to: editor.state.doc.length, insert: code } });
  }, [code, activeIterationId]);

  useEffect(() => {
    editorRef.current?.dispatch({
      effects: themeCompartment.reconfigure(theme === 'dark' ? oneDark : lightTheme),
    });
  }, [theme]);

  const copy = async () => {
    await navigator.clipboard.writeText(code);
    setCopied(true);
    window.setTimeout(() => setCopied(false), 1_400);
  };

  return (
    <section className="editor-shell" aria-label="Java editor">
      <div className="panel-toolbar editor-toolbar">
        <div className="file-tab">
          <span className="java-file-icon">J</span>
          <span>{fileName}</span>
          <i aria-label={saved ? 'Збережено локально' : 'Збереження…'} />
        </div>
        <label className="iteration-picker">
          <span>ITERATION</span>
          <select value={activeIterationId} onChange={(event) => onIterationChange(event.target.value)}>
            {iterations.map((iteration) => (
              <option key={iteration.id} value={iteration.id}>{iteration.label}</option>
            ))}
          </select>
        </label>
        <button className="toolbar-button" onClick={copy} title="Копіювати код">
          {copied ? <Check size={14} /> : <Clipboard size={14} />}
          {copied ? 'Copied' : 'Copy'}
        </button>
        <button className="toolbar-button danger-on-hover" onClick={onReset} title="Відновити код із репозиторію">
          <RotateCcw size={14} /> Reset
        </button>
      </div>
      <div ref={hostRef} className="editor-host" />
      <footer className="editor-statusbar">
        <span>Java 21</span>
        <span>Spaces: 4</span>
        <span>UTF-8</span>
        <span className={saved ? 'saved-indicator is-saved' : 'saved-indicator'}>
          {saved ? '● Saved locally' : '● Saving…'}
        </span>
        <span className="shortcut-hint"><kbd>Ctrl</kbd> + <kbd>Enter</kbd> Run tests</span>
      </footer>
    </section>
  );
}
