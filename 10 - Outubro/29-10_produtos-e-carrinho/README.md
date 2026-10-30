# Monitoria de 29/10 — Produtos e carrinho

Implementação parcial do exercício 3 da Lista de Exercícios - Polimorfismo em Java: um sistema de pedidos com produtos nacionais e importados. O projeto registra o código desenvolvido na monitoria e os pontos para continuidade.

## Materiais

- [Lista de exercícios](enunciado.pdf), exercício 3 nas páginas 2 e 3.
- [Notas de estudo](notas.md): herança, sobrescrita, sobrecarga, instanceof e casting.

## Classes e conceitos

- `Produto`: atributos privados, construtor, métodos de acesso e preço final básico.
- `ProdutoImportado`: herança, chamada de `super`, sobrescrita do preço final e declaração alfandegária.
- `Carrinho`: `ArrayList<Produto>`, três sobrecargas de `adicionarProduto`, percurso da coleção, `instanceof` e downcasting.
- `Main`: criação de um produto importado e impressão de sua declaração.

## Estado do exercício

O enunciado pede um vetor de `Produto`; o código recebido usa `ArrayList<Produto>`. O método `Carrinho.calcularTotal()` ainda imprime as declarações dos importados, sem somar preços. O método separado `emitirDeclaracoes()` e a entrada de dados no `Main` ainda precisam ser implementados. Esses itens são continuação proposta, não funcionalidades concluídas.

As quatro fontes Java foram preservadas. Na cópia publicada, o nome interno do projeto foi ajustado ao diretório e a propriedade `main.class` foi corrigida para `ex3_pequeno_sistema_.Main`; ela apontava para uma classe inexistente.

## Executar

Abra esta pasta no NetBeans com JDK 25 e execute `ex3_pequeno_sistema_.Main`. As quatro classes foram compiladas com `javac -Xlint:all` e o `Main` foi executado. Saída:

```text
Declaracao: BYD | origem: China | taxa paga: R$ 500.0
```

## Para continuar

1. Fazer `calcularTotal()` somar `p.calcularPrecoFinal()` e devolver o resultado.
2. Separar a emissão das declarações, mantendo a verificação de tipo antes do cast.
3. Usar o carrinho no `Main`, ler produtos dos dois tipos e exibir total e declarações.
4. Repetir com o vetor solicitado no enunciado e formatar valores monetários com duas casas decimais.
