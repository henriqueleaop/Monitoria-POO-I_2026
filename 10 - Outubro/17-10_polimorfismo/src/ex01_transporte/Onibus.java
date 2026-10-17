
package ex01_transporte;

public class Onibus extends Transporte {
    private int quantidadeParadas;

    public Onibus() {
    }

    public Onibus(int quantidadeParadas, int capacidade, double valorBase) {
        super(capacidade, valorBase);
        this.quantidadeParadas = quantidadeParadas;
    }

    @Override
    public double calcularTarifa() {
        return valorBase + (quantidadeParadas*0.5);
    }
    
    
    
}
