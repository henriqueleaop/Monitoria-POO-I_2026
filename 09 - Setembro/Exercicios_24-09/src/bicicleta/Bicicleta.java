package bicicleta;

public class Bicicleta {
    public static int quantidade = 0;
    
    private String modelo;
    private double diaria;
    private boolean disponivel;
    
    private double taxaEletrica;
    
    
    public Bicicleta(String modelo, double diaria){
        this.modelo = modelo;
        this.diaria = diaria;
        this.disponivel = true;
        this.quantidade++;
    }
    
    public Bicicleta(String modelo, double diariaBase, double taxa){
        this(modelo, diariaBase + taxa);
        this.taxaEletrica = taxa;
    }
    
    public void alugar(){
        if (this.disponivel){
            this.disponivel = false;
            System.out.println("Bicicleta alugada!");
        } else {
            System.out.println("A bicicleta não está disponível para locação!");
        }
    }
    
    public void devolver(){
        if (!this.disponivel){
            this.disponivel = true;
            System.out.println("Bicicleta devolvida!");
        } else {
            System.out.println("A bicicleta não está sendo alugada!");
        }
    }
    
    public double calcularAluguelPorDias(int dias){
        if (dias > 0){
            return dias * diaria;
        }
        return 0;
    }
    
    public double calcularAluguelPorDias(int dias, double descontoPercentual){
        double total = 0;
        if (dias > 0){ 
            total = dias * diaria;
        }
        if(descontoPercentual > 0 && descontoPercentual < 100){
            total -= total * (descontoPercentual/100);
        }
        return total;
    }
   
}