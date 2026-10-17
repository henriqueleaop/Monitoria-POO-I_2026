# Monitoria de 22/08 — Classes e objetos

Primeiros programas orientados a objetos: um sistema de alunos (versão inicial e versão refatorada) e uma loja com produtos em estoque.

## Onde está o código

```text
src/exLoja/Loja.java
src/exLoja/Produto.java
src/exemplo/Exemplo.java
src/exemplo/SistemaAlunoRefatoradooc.java
src/exemplo/SistemaAlunos.java
```

## Conceitos trabalhados

- **Classes, atributos e métodos:** `Produto` guarda nome, preço e estoque e oferece `adicionarEstoque`, `removerEstoque` e `verificarEstoque`.
- **Objetos e `new`:** cada produto da `Loja` é um objeto diferente da mesma classe.
- **Refatoração:** `SistemaAlunos` e `SistemaAlunoRefatoradooc` resolvem o mesmo cadastro; a segunda versão separa o programa em métodos (`exibirMenu`, `lerNotaValida`, `cadastrarAluno`, `listarAlunos`...).
- **Vetores e `Scanner`:** leitura de dados pelo teclado com validação e armazenamento em vetores.
- **`toString`:** a forma de um objeto aparecer como texto.

## Para praticar

1. Compare `SistemaAlunos` com `SistemaAlunoRefatoradooc`: o que ficou mais fácil de ler e de alterar?
2. Acrescente à `Loja` um método que mostre o valor total do estoque.

Abra a pasta no NetBeans (**File → Open Project**) e execute a classe que tem o método `main`.
