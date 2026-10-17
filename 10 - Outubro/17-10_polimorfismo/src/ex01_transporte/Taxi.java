package ex01_transporte;

public class Taxi extends Transporte {
    private double quilometragem;

    public Taxi() {
    }

    public Taxi(double quilometragem, int capacidade, double valorBase) {
        super(capacidade, valorBase);
        this.quilometragem = quilometragem;
    }
    
    @Override
    public double calcularTarifa(){
        return valorBase + (quilometragem*2.00);
    }
}
