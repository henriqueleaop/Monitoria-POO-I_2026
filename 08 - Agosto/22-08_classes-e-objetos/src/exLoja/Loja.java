package exLoja;

public class Loja {

    public static void main(String[] args) {
        Produto p1 = new Produto("detergente", 2.55, 5); 
        p1.removerEstoque(46);
        p1.toString();
        p1.verificarEstoque();
        p1.adicionarEstoque(20);
        p1.verificarEstoque();
    }
    
}
