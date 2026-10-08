package prova;

public class Moeda {

    protected double valor;
    private static int totalMoedas = 0;

    public Moeda(double valor) {
        this.valor = valor;
        totalMoedas++;
    }

    public double converte() {
        return 0.0;
    }
    
    public void info() {
        System.out.println("Valor: " + valor);
    }

    public static int getTotalMoedas() {
        return totalMoedas;
    }
}
