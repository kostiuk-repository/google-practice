import { describe, expect, it } from 'vitest';
import { render } from '@testing-library/react';
import { DocViewer } from './DocViewer';

describe('DocViewer Java highlighting', () => {
  it('uses parser-derived token classes for fenced Java code', () => {
    const { container } = render(
      <DocViewer theme="dark" markdown={'```java\npublic class Sample { String value = "ok"; }\n```'} />,
    );
    expect(container.querySelector('.syntax-java .tok-keyword')?.textContent).toBe('public');
    expect(container.querySelector('.syntax-java .tok-string')?.textContent).toBe('"ok"');
  });
});
