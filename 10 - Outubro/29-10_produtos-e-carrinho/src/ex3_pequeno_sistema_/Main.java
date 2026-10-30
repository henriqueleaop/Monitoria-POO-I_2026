
package ex3_pequeno_sistema_;

public class Main {

    public static void main(String[] args) {
        ProdutoImportado produtoI = new ProdutoImportado("China", 500.00, "BYD",1000.00);
        System.out.println(produtoI.emitirDeclaracaoAlfandega());
    }
    
}
