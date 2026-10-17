
package exercicios_monitoria_05.pkg09.pkg2026;


public class Produto {
    
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;
    
    public Produto (String nome) {
        setNome(nome);
    }
    
    public Produto(String nome, double preco) {
        setNome(nome);
        setPreco(preco);
    }

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        setNome(nome);
        setPreco(preco);
        setQuantidadeEmEstoque(quantidadeEmEstoque);
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    public int getQuantidadeEmEstoque(){
        return this.quantidadeEmEstoque;
    }
    
    public void setNome(String qualquerCoisa){
        this.nome = qualquerCoisa;
    }

    public void setPreco(double preco) {
        if(preco >= 0){
            this.preco = preco;
        } else {
            System.out.println("O preco não pode ser negativo!");
        }
        
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        if(preco >= 0){
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        } else {
            System.out.println("A quantidade não pode ser negativa!");
        }
    }
    
    
    
    
}
