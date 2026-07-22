import { describe, expect, it, vi } from 'vitest';
import { fireEvent, render, screen } from '@testing-library/react';
import userEvent from '@testing-library/user-event';
import { SettingsModal } from './SettingsModal';
import { DEFAULT_RUNNER_SETTINGS } from '../types/runner';

describe('SettingsModal readability controls', () => {
  it('saves UI and editor font sizes separately', async () => {
    const user = userEvent.setup();
    const onSaveDisplay = vi.fn();
    render(
      <SettingsModal
        open
        settings={DEFAULT_RUNNER_SETTINGS}
        displaySettings={{ uiFontSize: 'comfortable', editorFontSize: 14 }}
        onClose={vi.fn()}
        onSave={vi.fn()}
        onSaveDisplay={onSaveDisplay}
      />,
    );
    await user.selectOptions(screen.getByLabelText('Interface & documentation'), 'large');
    const slider = screen.getByRole('slider');
    fireEvent.change(slider, { target: { value: '18' } });
    await user.click(screen.getByRole('button', { name: 'Save locally' }));
    expect(onSaveDisplay).toHaveBeenCalledWith({ uiFontSize: 'large', editorFontSize: 18 });
  });
});
