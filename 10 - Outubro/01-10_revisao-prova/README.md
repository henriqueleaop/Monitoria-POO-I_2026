# Monitoria de 01/10 — Revisão para a prova

Exemplos curtos sobre passagem de parâmetros e sobrecarga de métodos.

## Onde está o código

```text
src/exercicios_01/pkg10/Classe.java
src/exercicios_01/pkg10/Exercicios_0110.java
src/exercicios_01/pkg10/Impressora.java
```

## Conceitos trabalhados

- **Parâmetro × atributo:** em `alterar`, o parâmetro `valor` esconde o atributo e nada muda no objeto; em `alterar2`, `this.valor` altera o atributo.
- **Sobrecarga:** `Impressora` tem vários `imprimir` com parâmetros diferentes; o Java escolhe pelo tipo do argumento.
- **Divisão inteira:** `7 / 2` resulta em `3` e chama `imprimir(int)`; `7 / 2.0` resulta em `3.5` e chama `imprimir(double)`.

## Para praticar

1. Antes de executar, escreva o que cada linha do `main` vai imprimir e depois confira.
2. Acrescente um `imprimir(char)` e teste com `'5'`.

Abra a pasta no NetBeans (**File → Open Project**) e execute a classe que tem o método `main`.
