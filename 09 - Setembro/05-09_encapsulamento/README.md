# Monitoria de 05/09 — Encapsulamento

Biblioteca com livros e autores, produto com estoque e uma classe de exemplo para atributos públicos e privados.

## Onde está o código

```text
src/biblioteca/Autor.java
src/biblioteca/Biblioteca.java
src/biblioteca/Livro.java
src/exercicios_monitoria_05/pkg09/pkg2026/Classe.java
src/exercicios_monitoria_05/pkg09/pkg2026/Exercicios_monitoria_05092026.java
src/exercicios_monitoria_05/pkg09/pkg2026/Produto.java
```

## Conceitos trabalhados

- **Encapsulamento:** atributos `private` acessados por getters e setters.
- **Construtores sobrecarregados:** `Classe` tem construtores com quantidades diferentes de parâmetros.
- **Composição:** um `Livro` tem um `Autor`, e o `Autor` guarda seus livros em um `ArrayList`.
- **`toString` com `@Override`:** exibir o objeto como texto.

## Para praticar

1. Impeça, no setter, que o preço ou o estoque de `Produto` fiquem negativos.
2. Mostre todos os livros de um autor com título e ano.

Abra a pasta no NetBeans (**File → Open Project**) e execute a classe que tem o método `main`.
