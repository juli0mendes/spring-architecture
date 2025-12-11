# spring-architecture

![CI](https://github.com/juli0mendes/spring-architecture/actions/workflows/maven.yml/badge.svg)

Projeto de exemplo para demonstração de arquitetura com Spring Boot. O workflow GitHub Actions (`.github/workflows/maven.yml`) executa build e testes via Maven em pushes e pull requests nas branches `main` e em branches que começam com `feature*`, para Java 11, 17 e 21.

Como rodar localmente:

```bash
mvn -B -V clean verify
```
