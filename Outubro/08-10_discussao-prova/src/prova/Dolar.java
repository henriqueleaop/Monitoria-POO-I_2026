package prova;

public class Dolar extends Moeda {
    private static double cotacao = 5.0; 
    
    
    public Dolar() {
        this(1);
    }
    
    public Dolar(double valor) {
        super(valor);
    }
    
    public void setCotacao (double cotacao) {
        if (cotacao > 0) Dolar.cotacao = cotacao;
    }
    
    @Override
    public double converte(){
        return cotacao * valor;
    }
    
    @Override
    public void info(){
        System.out.printf(
                "Valor: %d\n Dólar: US$ %d = R$ %d", 
                valor, valor, converte());
    }

    
}
