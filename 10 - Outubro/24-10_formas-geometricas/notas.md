# Notas de estudo — 24/10/2026

O encontro retomou dúvidas do exercício de transportes e desenvolveu a questão 8 da [Lista 02](enunciado.pdf), com revisão das questões conceituais. Estas notas organizam o conteúdo para estudo; não são uma transcrição literal nem uma lista de presença.

## Enumerações, índices e sorteio

`TipoTransporte.values()` fornece um vetor com as constantes da enumeração. Para escolher uma delas, é possível sortear um índice válido com `random.nextInt(opcoes.length)` e acessar `opcoes[indice]`. O limite superior do sorteio é exclusivo. Usar o tamanho do vetor evita fixar um número que ficaria incorreto se a enumeração mudasse.

Uma enumeração permite nomear opções e reduzir o uso de números cujo significado não fica claro no código. O vetor guarda as opções; o método de sorteio gera o índice. São papéis diferentes.

## Formas e polimorfismo

`Forma` fornece nome, construtores e uma versão genérica de `area()`. `Retangulo` e `Circulo` herdam de `Forma` e sobrescrevem o cálculo:

- Retângulo: base vezes altura.
- Círculo: pi vezes raio ao quadrado. O código recebido usa `3.14`; `Math.PI` é uma alternativa para o estudo.
- Forma genérica: retorna zero, conforme o enunciado.

Uma coleção `ArrayList<Forma>` pode guardar objetos de classes filhas. Ao chamar `f.area()`, o método de instância sobrescrito é escolhido pelo tipo real do objeto. O tipo declarado da variável limita os membros que podem ser acessados diretamente, mas não elimina a sobrescrita.

O enunciado pede um vetor `Forma[]`; a solução feita no encontro explora `ArrayList<Forma>`. Compare `vetor.length` e `lista.size()`, `vetor[indice]` e `lista.get(indice)`, e a forma de inserir elementos em cada estrutura.

## Impressão e soma das áreas

`Forma.toString()` usa o nome e chama `this.area()`. A chamada continua sendo polimórfica: uma referência que aponta para um círculo usa o cálculo do círculo. Neste exemplo, o atributo `nome` evita usar uma sequência de testes de tipo apenas para formar o texto.

O `println` de um objeto usa sua representação textual. Um laço `for (Forma f : listaFormas)` pode imprimir cada elemento e somar os resultados de `f.area()` em uma variável acumuladora.

## Conversões e referências

Guardar um `Circulo` em uma variável `Forma` é uma conversão para a classe base, ou upcasting. O objeto continua sendo o mesmo. Recuperar o acesso específico a `Circulo` exige uma conversão explícita, ou downcasting, e o tipo real precisa ser compatível.

Um cast para tipo incompatível pode ser rejeitado na compilação quando os tipos declarados já impedem essa relação. Quando a conversão é permitida pelo compilador, mas incompatível com o objeto encontrado em execução, ocorre `ClassCastException`. `instanceof` ajuda a verificar a compatibilidade antes da conversão.

## Sobrescrita, sobrecarga e `@Override`

Na sobrecarga, existem métodos com o mesmo nome e listas de parâmetros diferentes. Na sobrescrita, uma subclasse fornece uma implementação compatível para um método herdado. O nome das variáveis dos parâmetros não é o que determina a assinatura; interessam o nome do método e os tipos dos parâmetros, na ordem correta.

`@Override` permite que o compilador detecte uma tentativa de sobrescrita que não corresponde a um método herdado. Ela não transforma um método diferente em uma sobrescrita.

## `final`, `String` e comparação

- Método `final`: não pode ser sobrescrito.
- Classe `final`: não pode ser estendida.
- Campo `final`: só pode receber sua atribuição permitida; uma referência final não torna o objeto referenciado automaticamente imutável.
- `String` é um tipo de referência e seus objetos são imutáveis. Ela não é um tipo primitivo. Reatribuir uma variável não modifica o objeto anterior. Ser uma classe final e ter objetos imutáveis são propriedades diferentes.
- `==` em referências compara identidade. `equals` pode definir igualdade de conteúdo. No exemplo recebido, `Forma.equals` compara os nomes de objetos que são formas.

Como exercício de melhoria, implemente um `hashCode` coerente com `equals`. O compilador emitiu esse aviso ao conferir o material; o código da monitoria foi preservado.

Foi comparado `equals(Forma outro)` com `equals(Object obj)`: o primeiro introduz uma sobrecarga, enquanto o segundo pode sobrescrever o método herdado de `Object`. O tipo declarado do argumento influencia a resolução da sobrecarga; por isso a assinatura correta e `@Override` são essenciais. A versão final recebida usa `equals(Object)` e verifica `instanceof Forma` antes do cast.

## Tipo da variável, objeto e interfaces

A analogia do controle remoto foi usada para distinguir o conjunto de operações acessível pelo tipo declarado da referência e o comportamento implementado pelo objeto. Uma referência de um tipo mais geral permite trabalhar com implementações diferentes por um contrato comum.

Na conversa sobre interfaces, foi dado o exemplo de um contrato de repositório com implementações diferentes de persistência. O ponto de estudo é reduzir o acoplamento ao detalhe da implementação. Uma interface não é instanciada diretamente: cria-se um objeto de uma classe que a implementa e guarda-se sua referência em uma variável do tipo da interface.

Os exemplos de frameworks e arquiteturas foram comentários conceituais; não foi recebido um projeto de API ou de acesso a banco como resultado desta monitoria.

## `super`, atributos e construção

`super(nome)` chama um construtor da classe base. `super.area()` chama a implementação correspondente da classe base, em vez da sobrescrita de `Circulo`. No exemplo, isso permite comparar o retorno zero de `Forma.area()` com o cálculo do círculo.

Nos testes de atributos com o mesmo nome na classe base e na classe filha, `super.nome` e `this.nome` permitiram distinguir os campos. Não confunda ocultação de atributos com sobrescrita de métodos. Esses testes temporários do vídeo não estão todos presentes no estado final do código recebido.

Na questão de comparação de alunos, o mesmo raciocínio de `equals` foi aplicado a um identificador de matrícula fictício: duas instâncias podem ser distintas e, ainda assim, equivalentes pela regra de conteúdo definida no método.

## Para retomar

1. Reescreva a coleção como `Forma[]`, atendendo literalmente ao enunciado.
2. Explique por que `toString()` em `Forma` consegue usar a área específica de cada objeto.
3. Compare o que é verificado na compilação e em execução antes de fazer um downcasting.
4. Explique a diferença entre uma referência final e um objeto imutável.
5. Descomente o bloco de demonstração do `main` para executar os exemplos recebidos.

Os tempos do material de apoio começam em zero no vídeo editado. Para localizar o mesmo ponto no original, acrescente 6min18s.
