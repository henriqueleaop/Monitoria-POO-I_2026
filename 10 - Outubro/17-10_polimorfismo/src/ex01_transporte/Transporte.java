package ex01_transporte;

public class Transporte {
   
    protected int capacidade;
    protected double valorBase;

    public Transporte() {
    }

    public Transporte(int capacidade, double valorBase) {
        this.capacidade = capacidade;
        this.valorBase = valorBase;
    }
    
    public double calcularTarifa(){
        return this.valorBase;
    }
}
