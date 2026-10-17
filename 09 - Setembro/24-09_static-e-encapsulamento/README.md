# Monitoria de 24/09 — Static e encapsulamento

Locadora de bicicletas comuns e elétricas.

## Onde está o código

```text
src/bicicleta/Bicicleta.java
src/bicicleta/Locadora.java
```

## Conceitos trabalhados

- **Atributo `static`:** `Bicicleta.quantidade` pertence à classe e conta quantas bicicletas foram criadas.
- **Encapsulamento:** modelo, diária e disponibilidade são `private`.
- **`this(...)`:** o construtor da bicicleta elétrica reaproveita o construtor comum.
- **Estado do objeto:** `alugar` e `devolver` só funcionam quando a bicicleta está na situação certa.

## Para praticar

1. Crie três bicicletas e mostre `Bicicleta.quantidade`. Por que o valor é o mesmo para todas?
2. Impeça o cálculo do aluguel com número de dias negativo.

Abra a pasta no NetBeans (**File → Open Project**) e execute a classe que tem o método `main`.
