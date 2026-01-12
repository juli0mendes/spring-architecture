# Spring Architecture

[![Maven CI](https://github.com/juli0mendes/spring-architecture/actions/workflows/maven.yml/badge.svg?branch=main)](https://github.com/juli0mendes/spring-architecture/actions/workflows/maven.yml)

Este projeto usa Java 21.

Projeto de exemplo para demonstração de arquitetura com Spring Boot.

O workflow do GitHub Actions (`.github/workflows/maven.yml`) executa build e testes via Maven automaticamente em:

- push para a branch `main`;
- push para qualquer branch que comece com `feature*`;
- pull requests direcionadas à `main` originadas de branches que começam com `feature*`.

O objetivo é garantir que o código em branches de feature não quebre antes de ser integrado na `main`.

O workflow utiliza Java 21 e executa o comando Maven:

```bash
mvn -B -DskipTests=false verify
```

Para reproduzir localmente, execute o comando acima no diretório do projeto. Lembre-se de abrir um pull request para que o CI rode automaticamente em PRs.
