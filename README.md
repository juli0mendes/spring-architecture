# Spring Architecture

[![Maven CI](https://github.com/juli0mendes/spring-architecture/actions/workflows/main.yml/badge.svg?branch=main)](https://github.com/juli0mendes/spring-architecture/actions/workflows/main.yml)

Este projeto usa Java 21.

Projeto de exemplo para demonstração de arquitetura com Spring Boot.

O workflow do GitHub Actions (`.github/workflows/main.yml`) executa build e testes via Maven automaticamente em:

- push para a branch `main`;
- push para qualquer branch que comece com `feature*`;
- pull requests direcionadas à `main` originadas de branches que começam com `feature*`.

O objetivo é garantir que o código em branches de feature não quebre antes de ser integrado na `main`.

O workflow utiliza Java 21 e executa o comando Maven:

```bash
mvn -B -DskipTests=false verify
```

Para reproduzir localmente, execute o comando acima no diretório do projeto. Lembre-se de abrir um pull request para que o CI rode automaticamente em PRs.

## Estrutura do Projeto
- `src/main/java`: Código-fonte principal da aplicação.
- `src/test/java`: Testes unitários e de integração.
- `pom.xml`: Configuração do Maven e dependências do projeto.
- `.github/workflows/maven.yml`: Configuração do workflow de CI/CD.
- `README.md`: Documentação do projeto.
- `.gitignore`: Arquivos e pastas a serem ignorados pelo Git.