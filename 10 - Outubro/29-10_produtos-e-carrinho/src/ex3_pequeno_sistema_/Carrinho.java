
package ex3_pequeno_sistema_;

import java.util.ArrayList;


public class Carrinho {
    private ArrayList<Produto> produtos;

    public Carrinho() {
        produtos = new ArrayList<>();
    }
    
    public void adicionarProduto(Produto p){
        this.produtos.add(p);
    }
    
    public void adicionarProduto(String nome, double preco){
        adicionarProduto(new Produto(nome, preco));  
    }
    
    public void adicionarProduto(String nome, double preco, double
taxaImportacao, String paisOrigem){
        adicionarProduto(new ProdutoImportado(paisOrigem, taxaImportacao, nome, preco));
    }
    
    public void calcularTotal(){
        for(Produto p: this.produtos){
            if(p instanceof ProdutoImportado){
                ProdutoImportado pI = (ProdutoImportado) p;
                System.out.println(pI.emitirDeclaracaoAlfandega());
            }
        }
    }
   
    
}
