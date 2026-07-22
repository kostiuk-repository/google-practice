import { useEffect, useRef, useState } from 'react';
import { basicSetup } from 'codemirror';
import {
  autocompletion,
  closeBrackets,
  snippetCompletion,
  type CompletionSource,
} from '@codemirror/autocomplete';
import { defaultKeymap, history, historyKeymap, indentWithTab } from '@codemirror/commands';
import { bracketMatching, indentOnInput, syntaxTree } from '@codemirror/language';
import { java } from '@codemirror/lang-java';
import { lintGutter, linter, type Diagnostic } from '@codemirror/lint';
import { highlightSelectionMatches, searchKeymap } from '@codemirror/search';
import { Compartment, EditorState } from '@codemirror/state';
import { oneDark } from '@codemirror/theme-one-dark';
import { EditorView, keymap, lineNumbers } from '@codemirror/view';
import { Check, Clipboard, Copy, Dumbbell, FileCode2, RotateCcw } from 'lucide-react';
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

const javaSnippets = [
  snippetCompletion(
    'for (int ${1:i} = 0; ${1} < ${2:array}.length; ${1}++) {\n\t${0}\n}',
    { label: 'fori', detail: 'Indexed for loop', info: 'Loop over array indices', type: 'keyword', boost: 100 },
  ),
  snippetCompletion(
    'for (${1:Type} ${2:item} : ${3:items}) {\n\t${0}\n}',
    { label: 'foreach', detail: 'Enhanced for loop', info: 'Iterate over an array or collection', type: 'keyword', boost: 99 },
  ),
  snippetCompletion(
    'if (${1:condition}) {\n\t${0}\n}',
    { label: 'if', detail: 'If statement', type: 'keyword', boost: 98 },
  ),
  snippetCompletion(
    'if (${1:condition}) {\n\t${2}\n} else {\n\t${0}\n}',
    { label: 'ifelse', detail: 'If / else statement', type: 'keyword', boost: 97 },
  ),
  snippetCompletion(
    'while (${1:condition}) {\n\t${0}\n}',
    { label: 'while', detail: 'While loop', type: 'keyword', boost: 96 },
  ),
  snippetCompletion(
    'do {\n\t${0}\n} while (${1:condition});',
    { label: 'dowhile', detail: 'Do / while loop', type: 'keyword' },
  ),
  snippetCompletion(
    'switch (${1:value}) {\n\tcase ${2:option} -> ${3};\n\tdefault -> ${0};\n}',
    { label: 'switch', detail: 'Java 21 switch', type: 'keyword' },
  ),
  snippetCompletion(
    'try {\n\t${1}\n} catch (${2:Exception} ${3:e}) {\n\t${0}\n}',
    { label: 'trycatch', detail: 'Try / catch block', type: 'keyword' },
  ),
  snippetCompletion(
    'try {\n\t${1}\n} finally {\n\t${0}\n}',
    { label: 'tryfinally', detail: 'Try / finally block', type: 'keyword' },
  ),
  snippetCompletion(
    'public static void main(String[] args) {\n\t${0}\n}',
    { label: 'main', detail: 'Main method', type: 'method', boost: 95 },
  ),
  snippetCompletion(
    'public ${1:void} ${2:methodName}(${3}) {\n\t${0}\n}',
    { label: 'method', detail: 'Public method', type: 'method' },
  ),
  snippetCompletion(
    'public class ${1:ClassName} {\n\t${0}\n}',
    { label: 'class', detail: 'Public class', type: 'class' },
  ),
  snippetCompletion(
    'System.out.println(${1:value});${0}',
    { label: 'sout', detail: 'Print line', type: 'function', boost: 94 },
  ),
  snippetCompletion(
    'System.err.println(${1:error});${0}',
    { label: 'serr', detail: 'Print error line', type: 'function' },
  ),
  snippetCompletion(
    'return ${1:value};${0}',
    { label: 'return', detail: 'Return value', type: 'keyword' },
  ),
  snippetCompletion(
    'List<${1:Integer}> ${2:list} = new ArrayList<>();${0}',
    { label: 'list', detail: 'Create ArrayList', type: 'variable' },
  ),
  snippetCompletion(
    'Map<${1:Integer}, ${2:Integer}> ${3:map} = new HashMap<>();${0}',
    { label: 'map', detail: 'Create HashMap', type: 'variable' },
  ),
  snippetCompletion(
    'Set<${1:Integer}> ${2:set} = new HashSet<>();${0}',
    { label: 'set', detail: 'Create HashSet', type: 'variable' },
  ),
  snippetCompletion(
    'Queue<${1:Integer}> ${2:queue} = new ArrayDeque<>();${0}',
    { label: 'queue', detail: 'Create queue', type: 'variable' },
  ),
  snippetCompletion(
    'Deque<${1:Integer}> ${2:stack} = new ArrayDeque<>();${0}',
    { label: 'stack', detail: 'Create stack', type: 'variable' },
  ),
  snippetCompletion(
    'Arrays.sort(${1:array});${0}',
    { label: 'sort', detail: 'Sort an array', type: 'function' },
  ),
];

const javaSnippetSource: CompletionSource = (context) => {
  const nodeName = syntaxTree(context.state).resolveInner(context.pos, -1).name;
  if (/Comment|String|Character/.test(nodeName)) return null;
  const word = context.matchBefore(/[A-Za-z]*/);
  if (!word || (word.from === word.to && !context.explicit)) return null;
  return {
    from: word.from,
    options: javaSnippets,
    validFor: /^[A-Za-z]*$/,
  };
};

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
  const [pathCopied, setPathCopied] = useState(false);
  const activeIteration = iterations.find((iteration) => iteration.id === activeIterationId) ?? iterations[0];
  const drills = iterations.filter((iteration) => iteration.kind === 'drill');

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
        autocompletion({
          override: [javaSnippetSource],
          activateOnTyping: true,
          maxRenderedOptions: 12,
        }),
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

  const copyPath = async () => {
    await navigator.clipboard.writeText(activeIteration.sourcePath);
    setPathCopied(true);
    window.setTimeout(() => setPathCopied(false), 1_400);
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
          <span>TASK / DRILL</span>
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
      <div className={activeIteration.kind === 'drill' ? 'drill-strip is-drill' : 'drill-strip'}>
        <div className="drill-strip-copy">
          <span className="drill-strip-icon">
            {activeIteration.kind === 'drill' ? <Dumbbell size={15} /> : <FileCode2 size={15} />}
          </span>
          <div>
            <strong>
              {activeIteration.kind === 'drill'
                ? `Drill ${String(activeIteration.order).padStart(2, '0')} of ${drills.length}`
                : `Main task + ${drills.length} drills`}
            </strong>
            <span>
              {activeIteration.kind === 'drill'
                ? 'Окрема тренувальна задача на ту саму техніку'
                : 'Після основної задачі пройдіть додаткові вправи нижче'}
            </span>
          </div>
        </div>
        <div className="drill-switcher" aria-label="Main task and drill files">
          {iterations.map((candidate) => (
            <button
              key={candidate.id}
              className={candidate.id === activeIteration.id ? 'is-active' : ''}
              onClick={() => onIterationChange(candidate.id)}
              title={candidate.label}
            >
              {candidate.kind === 'task' ? 'TASK' : `D${candidate.order}`}
            </button>
          ))}
        </div>
        <button className="drill-path" onClick={() => void copyPath()} title="Copy repository path">
          <code>{activeIteration.sourcePath}</code>
          {pathCopied ? <Check size={12} /> : <Copy size={12} />}
        </button>
      </div>
      <div ref={hostRef} className="editor-host" />
      <footer className="editor-statusbar">
        <span>Java 21</span>
        <span>Spaces: 4</span>
        <span>UTF-8</span>
        <span className="shortcut-hint"><kbd>Ctrl</kbd> + <kbd>Space</kbd> Snippets</span>
        <span className={saved ? 'saved-indicator is-saved' : 'saved-indicator'}>
          {saved ? '● Saved locally' : '● Saving…'}
        </span>
        <span className="shortcut-hint"><kbd>Ctrl</kbd> + <kbd>Enter</kbd> Run tests</span>
      </footer>
    </section>
  );
}
