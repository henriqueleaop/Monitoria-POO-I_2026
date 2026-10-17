# Monitoria de 08/10 — Discussão da prova

Questões da prova resolvidas e discutidas: produtos com desconto e importação e o cofrinho de moedas, continuado na monitoria de 15/10.

## Onde está o código

```text
src/importacao/ProdutoImportado.java
src/loja/Produto.java
src/prova/Cofrinho.java
src/prova/Dolar.java
src/prova/Euro.java
src/prova/Main.java
src/prova/Moeda.java
```

> **Atenção:** os pacotes `loja` e `importacao` reproduzem a questão da prova que pede para analisar as linhas marcadas de `(1)` a `(8)`. Algumas delas **não compilam de propósito** (por exemplo, `(1)`, `(2)` e `(6)`). Descobrir quais e por quê faz parte do exercício. O cofrinho, no pacote `prova`, compila normalmente: execute `prova.Main` (se o NetBeans avisar dos erros dos outros pacotes, escolha executar mesmo assim).

## Conceitos trabalhados

- **Herança e sobrescrita:** `ProdutoImportado` herda de `Produto`; `Dolar` e `Euro` herdam de `Moeda`.
- **Atributos `static`:** a cotação de `Dolar` e de `Euro` vale para todas as moedas do tipo, e `Moeda` conta o total de moedas criadas.
- **Vetores de objetos (15/10):** o `Cofrinho` guarda dólares e euros em vetores, controla a quantidade e recusa moedas quando o vetor ou o limite em reais acabam.
- **Retorno booleano:** os métodos de inclusão indicam se a moeda entrou.
- **Reaproveitamento:** `adicionarMoeda` concentra a lógica comum de `adicionarDolar` e `adicionarEuro`.

## Para praticar

1. Diferencie a capacidade do vetor da quantidade de moedas guardadas.
2. Acrescente ao `Cofrinho` a listagem de todas as moedas com o valor de cada uma em reais.

Abra a pasta no NetBeans (**File → Open Project**) e execute a classe que tem o método `main`.
