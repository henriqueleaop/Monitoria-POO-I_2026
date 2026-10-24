
package ex_08_formas_geometricas;

public class Circulo extends Forma {
    private double raio;

    public Circulo() {
    }

    public Circulo(double raio, String nome) {
        super(nome);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return 3.14*(raio*raio);
    }
    
    
}
