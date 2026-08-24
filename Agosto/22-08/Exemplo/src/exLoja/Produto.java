package exLoja;

public class Produto {
    
    private String nome;
    private double preco;
    private int quantidadeEstoque; 

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome.toUpperCase();
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
    
    public void trocarNome(String novoNome){
        this.nome = novoNome.toUpperCase();
    }
    
    /*Vamos modelar um Produto de uma loja. Crie a Classe: Crie um arquivo chamado Produto.java. Defina os Atributos:
    
        Crie os Métodos:
         Um método adicionarEstoque(int quantidade) que recebe um número como parâmetro e o adiciona à quantidadeEstoque. -> public
         Um método removerEstoque(int quantidade) que recebe um número e o subtrai da quantidadeEstoque. -> public
         Um método verificarEstoque() que imprime o nome do produto e a quantidadeatual em estoque. -> public*/ 
    
    public void adicionarEstoque(int quantidadeAdicionada){
        // 1 - condição: (quantidadeAdicionada < 0)
        // 2 - ? codição verdadeira: this.quantidadeEstoque+quantidadeAdicionada
        // 3 - : então
        this.quantidadeEstoque = (quantidadeAdicionada >= 0) ? this.quantidadeEstoque + quantidadeAdicionada : 0;
    }
    
    public void removerEstoque(int quantidadeRemovida){ 
        // quantidade em estoque (p1) = 5
        // quantidade que queremos remover de p1 = 9
        
        this.quantidadeEstoque = (quantidadeRemovida <= this.quantidadeEstoque) ? this.quantidadeEstoque - quantidadeRemovida : 0;
    }
    
    public void verificarEstoque(){
        System.out.println("---------------------------------------------------------");
        System.out.println("PRODUTO: " + this.nome);
        System.out.println("QUANTIDADE EM ESTOQUE: " + this.quantidadeEstoque);
        System.out.println("---------------------------------------------------------");
    }

    
    
    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", preco=" + preco + ", quantidadeEstoque=" + quantidadeEstoque + '}';
    }
    
    
    
    
}
