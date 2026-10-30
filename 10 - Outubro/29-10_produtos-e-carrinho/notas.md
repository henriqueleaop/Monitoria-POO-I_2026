# Notas de estudo da monitoria de 29 de outubro de 2026

O exercício 3 da lista de polimorfismo propõe um sistema de pedidos com produtos nacionais e importados. O código desta monitoria implementa parte do sistema e permite estudar herança, polimorfismo, sobrecarga e conversão de referências. A implementação recebida foi preservada; os pontos restantes estão indicados para continuidade.

## Produto e ProdutoImportado

Produto encapsula nome e preço em atributos privados, com construtor e métodos de acesso. Seu calcularPrecoFinal() devolve o preço básico. ProdutoImportado herda de Produto, acrescenta país de origem e taxa de importação e chama super(nome, preco) para inicializar a parte herdada.

A sobrescrita de calcularPrecoFinal(), marcada com @Override, soma preço e taxa de importação. Uma referência do tipo Produto pode apontar para um ProdutoImportado; ao chamar o método sobrescrito, Java usa a implementação do objeto real. Esse é o polimorfismo de sobrescrita.

emitirDeclaracaoAlfandega() é exclusivo de ProdutoImportado. A implementação monta a declaração com String.replace e informa nome, país e taxa paga. A taxa é somada como valor monetário, não como percentual.

## Carrinho e sobrecarga

O carrinho recebido usa ArrayList<Produto>, embora o enunciado peça um vetor de Produto. A lista aceita tanto Produto quanto ProdutoImportado, por herança e conversão para o tipo da superclasse.

Há três assinaturas de adicionarProduto: uma recebe um Produto; outra recebe nome e preço; a terceira recebe também taxa e país. As duas últimas constroem o objeto apropriado e delegam para adicionarProduto(Produto). Isso é sobrecarga: a escolha da assinatura depende dos argumentos usados na chamada.

Na classe recebida, o construtor de ProdutoImportado recebe país, taxa, nome e preço, nessa ordem. A sobrecarga do carrinho recebe nome, preço, taxa e país e reorganiza os argumentos ao construir o objeto.

## instanceof e casting

Durante o percurso da coleção, cada variável p tem tipo declarado Produto. Para chamar o método exclusivo da subclasse, o código verifica p instanceof ProdutoImportado e depois faz o cast (ProdutoImportado) p.

O teste garante que a referência aponta para um objeto compatível antes do downcasting. O cast não cria nem transforma um objeto; permite tratar a mesma referência como a subclasse. Sem essa verificação, um Produto comum convertido para ProdutoImportado causaria ClassCastException. A chamada de calcularPrecoFinal() já poderia ser feita por Produto, sem cast, porque esse método está declarado na superclasse.

## Estado da implementação

O método chamado calcularTotal() no Carrinho ainda não calcula nem devolve um total: percorre os produtos e imprime as declarações dos importados. Esse comportamento corresponde à tarefa de emitirDeclaracoes() solicitada na lista, que ainda não aparece como método separado.

A classe Main cria um ProdutoImportado com nome BYD, país China, preço 1000.00 e taxa 500.00 e imprime sua declaração. Ela não lê dados nem usa o carrinho. A saída recebida é Declaracao: BYD | origem: China | taxa paga: R$ 500.0. O cálculo sobrescrito desse produto resultaria em 1500.00, mas o Main atual não o imprime.

O código Java recebido foi mantido. Apenas a configuração de execução da cópia do projeto foi ajustada para ex3_pequeno_sistema_.Main, pois apontava para pkg29_10.Main, classe inexistente nas fontes fornecidas.

## Para continuar o exercício

1. Implementar calcularTotal() para acumular e devolver p.calcularPrecoFinal() de cada produto, usando o despacho polimórfico sem instanceof.
2. Separar a emissão das declarações em emitirDeclaracoes(), mantendo instanceof e casting para o método exclusivo dos importados.
3. Usar o carrinho no Main, incluir produtos nacionais e importados, ler os dados e mostrar o total e as declarações.
4. Repetir a solução com o vetor de Produto solicitado na lista e comparar sua gestão de capacidade com ArrayList.
5. Formatar os valores monetários com duas casas decimais e testar um carrinho vazio, produtos nacionais e uma combinação dos dois tipos.

Esses itens são propostas de continuidade, não atividades registradas como concluídas nesta monitoria. Não houve gravação; estas notas foram elaboradas a partir do código e do enunciado, sem transcrição ou minutagem.
