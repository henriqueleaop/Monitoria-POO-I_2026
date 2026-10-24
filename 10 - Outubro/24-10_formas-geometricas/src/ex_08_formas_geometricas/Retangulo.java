
package ex_08_formas_geometricas;


public class Retangulo extends Forma {
    private double altura;
    private double base;

    public Retangulo() {
    }

    public Retangulo(double altura, double base, String nome) {
        super(nome);
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double area() {
        return base*altura;
    }
    
    
   
    
    
}
