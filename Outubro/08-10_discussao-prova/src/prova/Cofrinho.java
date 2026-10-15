package prova;


public class Cofrinho {

    private Dolar[] dolares = new Dolar[10];
    private Euro[] euros = new Euro[10];
    private int qtdDolares = 0;
    private int qtdEuros = 0;
    private double limiteEmReais;

    public Cofrinho(double limiteEmReais) {
        this.limiteEmReais = limiteEmReais;
    }
    
    public boolean adicionarEuro(){
        if(adicionarMoeda(euros, Euro.cotacao, new Euro(), qtdEuros)){
            qtdEuros++;
            return true;
        }
        return false;
    }
    
    public boolean adicionarDolar(){
        if (adicionarMoeda(dolares, Dolar.cotacao, new Dolar(), qtdDolares)){
            qtdDolares++;
            return true;
        }
        return false;
        
    }
    
    public boolean adicionarMoeda(Moeda[] listaMoedas, 
            double valorEmReais, Moeda moedaNova, int quantidadeMoeda){
        if (listaMoedas[listaMoedas.length-1] != null 
                || !verificaLimite(valorEmReais)) {
            return false;
        }
        
        listaMoedas[quantidadeMoeda] = moedaNova;
        return true;
    }
    
    public boolean verificaLimite(double valorEmReais){
        return (getQuantidadeEmReais()+valorEmReais <= limiteEmReais);
    }
    
    public double getQuantidadeEmReais(){
        double totalEmReais = 0.0;
        for(int i = 0; i < dolares.length; i++){
            if(dolares[i] != null) totalEmReais += Dolar.cotacao;
            if(euros[i] != null) totalEmReais += Euro.cotacao;
        }
        return totalEmReais;
    }
    
    
}
