# Monitoria de 24/10 — Formas geométricas

Resolução da **questão 8 — Formas geométricas** da [Lista 02 de Polimorfismo](enunciado.pdf). `Circulo` e `Retangulo` especializam `Forma`, e cada classe calcula sua própria área. O exemplo também explora uma coleção de formas, referências, conversão de tipos e comparação de objetos.

O enunciado pede um vetor `Forma[]`. Durante o encontro foi usado `ArrayList<Forma>` para explorar a coleção dinâmica e seus métodos. Para praticar exatamente o enunciado, reescreva essa parte usando o vetor de três posições.

Também está disponível a [versão anotada da lista](enunciado-anotado.pdf), fornecida pelo monitor para acompanhar a revisão.

## Onde está o código

```text
src/ex_08_formas_geometricas/Circulo.java
src/ex_08_formas_geometricas/Forma.java
src/ex_08_formas_geometricas/Main.java
src/ex_08_formas_geometricas/Retangulo.java
```

## Conceitos trabalhados

- `Forma`: nome, construtores, método `area()`, `toString()` e `equals(Object)`.
- `Circulo` e `Retangulo`: atributos específicos e sobrescrita de `area()` com `@Override`.
- `ArrayList<Forma>` e `for` aprimorado: trabalhar com objetos diferentes pela mesma classe base e somar as áreas.
- Referências para o mesmo objeto, conversão para a classe base e conversão explícita para uma classe filha.
- `Random`: criar dimensões e escolher elementos para experimentar o comportamento.
- `equals`: a implementação do exemplo compara nomes de objetos que são formas; isso é diferente de comparar referências com `==`.

O código-fonte foi preservado como recebido. **O trecho de demonstração do `main` está comentado**: executar o projeto nesse estado não produz saída. Para experimentar, descomente o bloco em `Main.java`.

A configuração recebida do NetBeans usa Java 26. Se seu ambiente tiver outra versão, ajuste a plataforma e o nível de código nas propriedades do projeto. Os quatro arquivos Java também foram compilados diretamente com o JDK 25 na conferência do material.

## Para praticar

1. Descomente o bloco do `main`, execute e identifique qual implementação de `area()` é chamada em cada objeto.
2. Compare `forma1 == forma2` e `forma1.equals(forma3)` e explique a diferença.
3. Antes de converter uma referência para a classe filha, verifique se o objeto possui o tipo esperado.
4. Como melhoria do exemplo, substitua `3.14` por `Math.PI` e compare os resultados.
5. O compilador avisa que `Forma` sobrescreve `equals` sem sobrescrever `hashCode`. Discuta por que os dois devem ser coerentes, especialmente ao usar `HashSet` ou `HashMap`.

## Material do encontro

- [Notas didáticas](notas.md)
- [Minutagem do encontro](minutagem.md)
- [Transcrição temática para estudo](transcricao-estudo.md) — texto editado, sem identificação de falantes; não é transcrição literal.

Os tempos começam no início do vídeo publicado, após o corte de 6min18s do arquivo original. Consulte o monitor para acessar a gravação e os documentos de apoio no Drive.

Abra a pasta no NetBeans (**File → Open Project**) e execute a classe que tem o método `main`.
