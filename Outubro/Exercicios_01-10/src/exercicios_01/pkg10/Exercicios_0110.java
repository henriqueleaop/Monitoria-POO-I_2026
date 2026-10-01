package exercicios_01.pkg10;

public class Exercicios_0110 {

    public static void main(String[] args) {
        Classe c = new Classe(10);
        
        System.out.println(c.toString());

        Impressora i = new Impressora();
        i.imprimir(5);
        i.imprimir(5.0);
        i.imprimir("5");
        i.imprimir(7 / 2);
        i.imprimir(7 / 2.0);
        i.imprimir("Oi", 3);
    }

}
