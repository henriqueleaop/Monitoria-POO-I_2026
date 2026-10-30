
package ex3_pequeno_sistema_;

public class ProdutoImportado extends Produto {
    private String paisOrigem;
    private double taxaImportacao;
    private final String templateDeclaracao = "Declaracao: %nome | origem: %pais | taxa paga: R$ %taxa";

    public ProdutoImportado(String paisOrigem, double taxaImportacao, String nome, double preco) {
        super(nome, preco);
        this.paisOrigem = paisOrigem;
        this.taxaImportacao = taxaImportacao;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public double getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(double taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }
    
    

    @Override
    public double calcularPrecoFinal() {
        return super.getPreco() + this.taxaImportacao; 
    }
    
    public String emitirDeclaracaoAlfandega(){
        String declaracao = templateDeclaracao;
        declaracao = declaracao.replace("%nome", super.getNome());
        declaracao = declaracao.replace("%pais", getPaisOrigem());
        declaracao = declaracao.replace("%taxa", String.valueOf(getTaxaImportacao()));
        
        return declaracao;
    }
    
    
    
    
    
    
    
}
