export type Difficulty = 'Easy' | 'Medium' | 'Hard';
export type Track = 'DSA' | 'Concurrency';

export interface TopicMeta {
  id: string;
  number: number;
  title: string;
  track: Track;
  taskCount: number;
  easyCount: number;
  mediumCount: number;
  hardCount: number;
}

export interface Iteration {
  id: string;
  label: string;
  fileName: string;
  source: string;
}

export interface PracticeTask {
  id: string;
  baseName: string;
  title: string;
  difficulty: Difficulty;
  order: number;
  packageName: string;
  doc: string;
  testFileName: string;
  testSource: string;
  iterations: Iteration[];
}

export interface TopicContent extends TopicMeta {
  notes: string;
  guide: string;
  tasks: PracticeTask[];
}

export interface CatalogManifest {
  generatedAt: string;
  topics: TopicMeta[];
}

export interface SourceFile {
  name: string;
  content: string;
}

export interface HarnessContent {
  practiceAssertions: string;
  sharedSources: SourceFile[];
}
