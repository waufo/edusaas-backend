# Guide de contribution — EduSaaS

## Convention de nommage des branches

| Type | Format | Exemple |
|---|---|---|
| Nouvelle feature | `feature/EDU-XX-description` | `feature/EDU-11-spring-boot-init` |
| Correction bug | `fix/EDU-XX-description` | `fix/EDU-12-jwt-expiration` |
| Hotfix production | `hotfix/EDU-XX-description` | `hotfix/EDU-34-db-connection` |
| Chore / config | `chore/EDU-XX-description` | `chore/EDU-5-github-actions` |

## Règles des commits (Conventional Commits)

Format : `type(scope): description courte`

Exemples :
- `feat(student): add create student use case`
- `fix(auth): fix jwt token expiration handling`
- `chore(ci): add github actions workflow`
- `test(grade): add unit tests for grade calculator`
- `docs(readme): update installation instructions`

## Workflow

1. Crée ta branche depuis `develop`
2. Code et commite régulièrement
3. Ouvre une Pull Request vers `develop`
4. Le CI doit passer au vert avant le merge
5. Merge dans `develop`, jamais directement dans `main`