```markdown
# Kotlin-Multiplatform-Mobile-Sample Development Patterns

> Auto-generated skill from repository analysis

## Overview
This skill teaches you the core development patterns and conventions used in the `Kotlin-Multiplatform-Mobile-Sample` repository. While the repository name suggests Kotlin, the codebase is actually written in TypeScript with no specific framework detected. You'll learn about file naming, import/export styles, commit message patterns, and how to write and run tests. This guide also provides suggested commands for common workflows.

## Coding Conventions

### File Naming
- Use **camelCase** for file names.
  - Example: `userProfile.ts`, `dataFetcher.ts`

### Import Style
- Use **relative imports** for modules within the project.
  - Example:
    ```typescript
    import { fetchData } from './dataFetcher';
    ```

### Export Style
- Use **named exports** for functions, classes, or constants.
  - Example:
    ```typescript
    // In userProfile.ts
    export function getUserProfile(id: string) { ... }
    ```

### Commit Messages
- Commit messages are **freeform** (no enforced structure).
- Commonly short, average length ~19 characters.
- Prefixes are not consistently used.

## Workflows

### Adding a New Module
**Trigger:** When you need to add a new feature or utility.
**Command:** `/add-module`

1. Create a new file using camelCase naming (e.g., `newFeature.ts`).
2. Use relative imports to include dependencies.
3. Export your functions or classes using named exports.
4. Write corresponding test files as `*.test.ts`.
5. Commit changes with a concise message.

### Writing and Running Tests
**Trigger:** When you add or update code that requires testing.
**Command:** `/run-tests`

1. Create a test file named `yourModule.test.ts`.
2. Write your tests (testing framework is unknown; follow existing patterns).
3. Run the test suite using the project's test runner (consult project docs or package.json).
4. Review and fix any failing tests.

## Testing Patterns

- Test files follow the `*.test.*` naming convention (e.g., `userProfile.test.ts`).
- The testing framework is not explicitly detected; check existing test files for examples.
- Place test files alongside the modules they test or in a dedicated test directory.

### Example Test File
```typescript
// userProfile.test.ts
import { getUserProfile } from './userProfile';

test('should fetch user profile by ID', () => {
  const profile = getUserProfile('123');
  expect(profile.id).toBe('123');
});
```

## Commands
| Command       | Purpose                                   |
|---------------|-------------------------------------------|
| /add-module   | Scaffold a new module with conventions    |
| /run-tests    | Run the test suite for the codebase       |
```
