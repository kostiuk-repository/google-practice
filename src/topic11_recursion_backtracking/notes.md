# Recursion & Backtracking - Study Notes

**Recursion** is a programming technique where a function calls itself.
**Backtracking** is a systematic method for exploring all possible configuration states of a search space (similar to building a tree of choices and pruning invalid branches).

---

## 1. Backtracking Template
```java
public void backtrack(State state, List<Result> results) {
    if (state.isGoal()) {
        results.add(new Result(state));
        return;
    }
    for (Choice choice : getChoices(state)) {
        if (isValid(choice, state)) {
            state.apply(choice); // Make choice
            backtrack(state, results);
            state.remove(choice); // Backtrack (Undo choice)
        }
    }
}
```

---

## 2. Key Google Interview Tips
* Draw the recursion tree to explain backtracking.
* **Identify duplicates early:** Sort candidates and skip duplicate loops (e.g., in Combination Sum II) to avoid generating redundant answers.
* **Pruning:** Stop searching paths that will definitely fail.
