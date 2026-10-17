// arquivo importacao/ProdutoImportado.java
package importacao;

import loja.Produto;

public class ProdutoImportado extends Produto {

    private double taxa;

    public ProdutoImportado(String codigo, double preco, double taxa) {
        super(codigo, preco);
        this.taxa = taxa;
    }

    public ProdutoImportado(String codigo) {
        this.taxa = 0.2;
        super(codigo, 0); // (4)
    }

    public void aplicarTaxa() {
        preco = preco + preco * taxa; // (5)
        categoria = "Importado"; // (6)
        System.out.println("Importado: " + getCodigo()); // (7)
    }

    @Override
    public void exibir() { // (8)
        super.exibir();
        System.out.println("Taxa: " + taxa);
    }
}
