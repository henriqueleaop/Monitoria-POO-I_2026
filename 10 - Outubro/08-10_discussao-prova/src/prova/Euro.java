package prova;

public class Euro extends Moeda {
    public static double cotacao = 6.10; 
    
    
    public Euro() {
        this(1);
    }
    
    public Euro(double valor) {
        super(valor);
    }
    
    public void setCotacao (double cotacao) {
        if (cotacao > 0) Euro.cotacao = cotacao;
    }
    
    @Override
    public double converte(){
        return cotacao * valor;
    }
    
    @Override
    public void info(){
        System.out.printf(
                "Valor: %d\n Euro: US$ %d = R$ %d", 
                valor, valor, converte());
    }

    
}
