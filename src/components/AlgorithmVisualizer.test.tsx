import { describe, expect, it } from 'vitest';
import { render, screen } from '@testing-library/react';
import userEvent from '@testing-library/user-event';
import axe from 'axe-core';
import { AlgorithmVisualizer } from './AlgorithmVisualizer';

const source = JSON.stringify({
  type: 'array',
  title: 'Prediction test',
  values: [1, 2, 3],
  steps: [
    { label: 'Start', pointer: 0, prediction: { prompt: 'Next index?', options: ['0', '1'], answer: 1, explanation: 'i increments.' } },
    { label: 'Moved', pointer: 1, visited: [0] },
  ],
});

describe('AlgorithmVisualizer', () => {
  it('requires a prediction before revealing the next step', async () => {
    const user = userEvent.setup();
    render(<AlgorithmVisualizer source={source} theme="dark" />);
    const next = screen.getByRole('button', { name: 'Next step' });
    expect(next).toBeDisabled();
    await user.click(screen.getByRole('button', { name: '1' }));
    expect(screen.getByText(/Правильно/)).toBeInTheDocument();
    expect(next).toBeEnabled();
    await user.click(next);
    expect(screen.getAllByText('Moved')).not.toHaveLength(0);
  });

  it('has no automatically detectable accessibility violations', async () => {
    const { container } = render(<AlgorithmVisualizer source={source} theme="dark" />);
    const results = await axe.run(container);
    expect(results.violations).toEqual([]);
  });
});
