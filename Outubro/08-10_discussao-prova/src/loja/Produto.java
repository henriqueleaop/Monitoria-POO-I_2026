// arquivo loja/Produto.java
package loja;

public class Produto {

    private String codigo;
    protected double preco;
    String categoria;
    private static int total = 0;

    public Produto(String codigo, double preco) {
        this.codigo = codigo;
        this.preco = preco;
        total++;
    }

    public String getCodigo() {
        return codigo;
    }

    public static String resumo() {
        return codigo + " " + total; // (1)
    }

    public void aplicarDesconto(double pct) {
        preco = preco - preco * pct;
    }

    public boolean aplicarDesconto(double limite) { // (2)
        return preco > limite;
    }

    public void aplicarDesconto(double pct, int vezes) { // (3)
        preco = preco - preco * pct * vezes;
    }

    public void exibir() {
        System.out.println(codigo + ": " + preco);
    }
}
