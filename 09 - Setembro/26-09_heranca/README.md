# Monitoria de 26/09 — Herança

Guilda de aventureiros (personagem, guerreiro e mago) e um torneio de jogadores.

## Onde está o código

```text
src/guilda_aventureiros/Exercicios_2609.java
src/guilda_aventureiros/Guerreiro.java
src/guilda_aventureiros/Mago.java
src/guilda_aventureiros/Personagem.java
src/torneio_games/Jogador.java
src/torneio_games/Torneio.java
```

## Conceitos trabalhados

- **Herança:** `Guerreiro` e `Mago` herdam de `Personagem` (`extends`).
- **`super(...)`:** o construtor da subclasse chama o da classe mãe.
- **Sobrescrita:** `toString` com `@Override` em cada tipo de personagem.
- **Métodos específicos:** `golpearComEspada` no guerreiro e `lancarFeitico` no mago.
- **Vetores:** o torneio guarda jogadores e pontuações e encontra a maior pontuação.

## Para praticar

1. Crie um `Arqueiro` que também herde de `Personagem`.
2. O que acontece ao chamar `lancarFeitico` em uma variável do tipo `Personagem`? Por quê?

Abra a pasta no NetBeans (**File → Open Project**) e execute a classe que tem o método `main`.
