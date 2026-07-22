export interface LearningRecord {
  attempts: number;
  passed: boolean;
  hintsRevealed: number;
  confidence: 0 | 1 | 2 | 3;
  lastAttemptAt?: string;
}

export const EMPTY_LEARNING_RECORD: LearningRecord = {
  attempts: 0,
  passed: false,
  hintsRevealed: 0,
  confidence: 0,
};
