# Monitoria de 17/10 — Polimorfismo com transportes

Resolução do **Exercício 1 (Sobrescrita com Herança)** da [lista de exercícios de polimorfismo](Lista_Exercicios_Polimorfismo_Java.pdf), feita durante a monitoria remota.

## Onde está o código

```text
src/ex01_transporte/
├── Transporte.java          classe mãe: capacidade, valorBase e calcularTarifa()
├── Onibus.java              herda de Transporte; tarifa = valorBase + quantidadeParadas * 0.50
├── Taxi.java                herda de Transporte; tarifa = valorBase + quilometragem * 2.00
└── ControleTransporte.java  main: ArrayList<Transporte>, geração aleatória e mostrarTarifas()
```

## Conceitos trabalhados

- **Herança e sobrescrita:** `Onibus` e `Taxi` reescrevem `calcularTarifa()` com `@Override`.
- **Polimorfismo:** a lista é do tipo `ArrayList<Transporte>`, mas guarda ônibus, táxis e transportes genéricos. Ao chamar `t.calcularTarifa()`, o Java executa a versão da classe com que o objeto foi criado.
- **`ArrayList`:** lista dinâmica (não precisa informar o tamanho), com `add`, `size` e `get`, e o tipo dos elementos entre `< >` (*generics*).
- **`for` aprimorado:** `for (Transporte t : listaTransporte)` percorre a lista sem índice.
- **`Random`:** `nextInt(origem, limite)` e `nextDouble(origem, limite)` geram valores aleatórios para os testes. O limite superior **não** entra no sorteio.
- **`instanceof`:** descobre o tipo real do objeto. A ordem dos testes importa: um `Onibus` também é `instanceof Transporte`, por isso é usado `if / else if / else`.
- **`printf("%.2f")`:** mostra o valor com duas casas decimais (`%d` é para inteiros, `%f` para números com casas decimais).

## Para praticar

1. Antes de executar, tente prever o que aparece na tela.
2. O `main` cria **10 milhões** de transportes, como no teste feito na monitoria. Para ver o resultado rapidamente, troque `10000000` por `10`.
3. Refaça sozinho o **Exercício 2** (despesas), que usa as mesmas ideias: classe mãe, duas filhas que sobrescrevem `calcularTotal()` e uma coleção percorrida chamando o método.
4. Desafio: o **Exercício 3** (carrinho) acrescenta **sobrecarga** de métodos (`adicionarProduto` com parâmetros diferentes).
