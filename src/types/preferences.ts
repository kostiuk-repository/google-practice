export type UiFontSize = 'compact' | 'comfortable' | 'large';

export interface DisplaySettings {
  uiFontSize: UiFontSize;
  editorFontSize: number;
}

export const DEFAULT_DISPLAY_SETTINGS: DisplaySettings = {
  uiFontSize: 'comfortable',
  editorFontSize: 14,
};
