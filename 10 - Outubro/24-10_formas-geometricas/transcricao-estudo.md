# Transcrição para estudo — 24/10/2026

Versão temática editada a partir do reconhecimento automático e do código recebido. O texto foi reescrito para leitura, sem identificar falantes ou reproduzir conversas pessoais; **não é uma transcrição literal**. A transcrição automática integral, com tempos, foi preservada no acervo do encontro. Consulte a gravação para conferir a formulação exata.

Tempos relativos ao vídeo editado, após o corte de 6min18s.

## 00:00:00 — Enum, switch e índices

Retomada do exercício de transportes. Os índices usados no sorteio e no switch precisam corresponder às opções. Uma enumeração nomeia os tipos e evita números sem significado explícito.

## 00:02:18 — values(), nextInt e limite exclusivo

values() fornece as opções da enumeração em um vetor. nextInt(opcoes.length) gera um índice válido: de zero até o tamanho menos um. O vetor guarda os elementos; o sorteio fornece o índice que será usado para acessá-los.

## 00:09:36 — Escolha da lista de revisão

A turma escolheu revisar a Lista 02 e desenvolver uma questão de implementação, usando o NetBeans para observar o comportamento dos exemplos.

## 00:16:11 — Questão 8: leitura do enunciado

A questão pede uma classe Forma, duas subclasses com cálculos específicos de área, representação textual e a soma das áreas de três objetos. O enunciado usa Forma[]; a implementação do encontro explora ArrayList<Forma>.

## 00:18:44 — Atributos, construtores e encapsulamento

Foram discutidos private e protected e criados construtores e formas de acessar o nome. Getters e setters foram gerados pelo NetBeans. Uma classe filha não acessa diretamente um campo privado da classe base.

## 00:23:25 — toString, @Override e assinatura

A representação textual foi implementada em Forma. @Override ajuda o compilador a detectar uma assinatura que não corresponde à sobrescrita pretendida. Mudar o nome de uma variável de parâmetro não altera a assinatura do método.

## 00:26:50 — Retângulo e círculo

Retangulo sobrescreve area() com base vezes altura. Circulo usa pi vezes o raio ao quadrado. A versão recebida usa 3.14; Math.PI e Math.pow foram discutidos como alternativas de escrita.

## 00:33:23 — ArrayList e tipo dos elementos

ArrayList é uma classe cuja instância representa a coleção. O parâmetro de tipo informa quais elementos ela admite. Uma lista de Forma pode guardar formas genéricas, círculos e retângulos, preservando o tipo real dos objetos.

## 00:38:13 — get, size e organização do main

get(indice) recupera um elemento da coleção e size() informa sua quantidade de elementos. Foi corrigida uma tentativa de colocar chamadas de método diretamente no corpo da classe, levando-as ao main.

## 00:41:48 — Cast e ClassCastException

O tipo declarado de uma referência limita os membros acessíveis. Para acessar operações específicas de uma classe filha, pode ser necessário um cast. A conversão não muda o objeto. Uma conversão incompatível permitida na compilação pode causar ClassCastException em execução; instanceof ajuda a verificá-la.

## 00:50:37 — Simplificação do toString

O atributo nome permitiu representar a forma sem uma sequência de testes instanceof apenas para decidir o texto. this.area() continua chamando a versão sobrescrita conforme o objeto real. Formatação de strings foi discutida, mas o resultado recebido usa concatenação.

## 00:57:32 — Laço e soma das áreas

Um for aprimorado percorre a coleção, imprime cada objeto e acumula sua área. println utiliza a representação textual do objeto; não é necessário chamar toString explicitamente para esse caso.

## 00:59:57 — final e imutabilidade de String

Foram testados final em métodos e classes: impedir sobrescrita e impedir herança são efeitos distintos. Também foi discutida String. Para estudar com precisão, String é um tipo de referência com objetos imutáveis; final em uma referência não torna qualquer objeto imutável.

## 01:06:03 — Revisão das questões conceituais

A revisão retomou sobrecarga, sobrescrita e @Override. Na sobrecarga, o mesmo nome pode ter listas de parâmetros diferentes. Na sobrescrita, a implementação compatível de um método herdado é substituída na classe filha.

## 01:11:43 — Tipo declarado e método executado

Uma referência Forma pode apontar para Circulo. Ao chamar um método de instância sobrescrito, o tipo real do objeto determina a implementação. O tipo declarado continua determinando quais membros são acessíveis no ponto da chamada.

## 01:13:52 — Upcasting e downcasting

Guardar uma referência de classe filha em uma variável da classe base é o upcasting. O caminho inverso exige conversão explícita e compatibilidade com o objeto. Foram comparados casts rejeitados na compilação e casts que falham durante a execução.

## 01:20:22 — final em campo e em classe

Foi revisada a atribuição de um campo final no construtor e a impossibilidade de reatribuí-lo em um setter comum. Uma classe final não pode ter subclasses que a estendam.

## 01:23:05 — Analogia do controle remoto

O exemplo foi usado para separar a interface disponível pelo tipo da referência e a implementação existente no objeto. O tipo da variável não representa o estado do objeto: ele delimita o conjunto de membros que o código pode acessar por aquela referência.

## 01:31:31 — Interfaces e desacoplamento

Foi apresentado um contrato de repositório com implementações diferentes de persistência. O objetivo é depender do contrato, em vez de uma implementação específica. Cria-se um objeto de uma classe que implementa a interface e usa-se uma referência do tipo da interface; a interface não é instanciada diretamente.

## 01:40:23 — Identidade e igualdade

== compara identidade de referências. equals pode comparar conteúdo, conforme sua implementação. Duas variáveis podem apontar para o mesmo objeto; dois objetos diferentes podem ser considerados equivalentes pela regra escolhida.

## 01:44:45 — equals herdado de Object

Foi consultada a implementação de Object.equals e observado que, sem sobrescrita, ela realiza comparação de identidade. A comparação de conteúdo depende de uma implementação apropriada na classe.

## 01:48:16 — Experimentos com referências

Foram comparadas duas referências para a mesma instância e duas instâncias com nomes iguais. Alterar o objeto por uma referência afeta o que outra referência para esse mesmo objeto observa. Igualdade de conteúdo e identidade não devem ser confundidas.

## 01:52:11 — equals por nome

A implementação de Forma.equals passou a comparar nomes. Os testes mostraram por que duas instâncias diferentes podem retornar verdadeiro nessa comparação. O código recebido ainda merece, como melhoria de estudo, um hashCode coerente com equals.

## 01:54:41 — Extensão do exemplo de animais

Foi discutido por que adicionar outra subclasse de Animal não exige alterar o laço que chama fazerSom() sobre uma coleção do tipo base. A implementação sobrescrita do novo tipo é selecionada pelo objeto.

## 01:57:29 — super e testes com campos

super(...) chama um construtor da classe base; super.metodo() chama a implementação da classe base. Testes com campos de mesmo nome permitiram distinguir this.nome e super.nome. Alguns experimentos temporários não permaneceram no código final.

## 02:08:12 — Teste de mesa: comparação de alunos

Foi analisado um exemplo didático de alunos e matrícula fictícia. A discussão compara instâncias distintas, a identidade das referências e a regra de igualdade de conteúdo definida por um método.

## 02:13:54 — equals(Object) versus equals de tipo específico

Foi reproduzida a diferença entre introduzir equals(Forma) e sobrescrever equals(Object). Uma assinatura específica pode criar apenas uma sobrecarga. O tipo declarado do argumento influencia a escolha da sobrecarga.

## 02:19:45 — Versão com Override, instanceof e cast

A revisão terminou com equals(Object), verificação de compatibilidade usando instanceof e cast para acessar o atributo da forma. A versão recebida é a referência para conferir o resultado final.

## 02:20:52 — Encerramento e indicação dos materiais

Foram combinados a disponibilização do código, das notas, das transcrições e de um índice com os pontos principais da gravação para estudo posterior.
