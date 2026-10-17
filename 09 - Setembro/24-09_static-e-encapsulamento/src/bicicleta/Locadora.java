package bicicleta;

import java.util.Scanner;

public class Locadora {

    public static void main(String[] args) {
        System.out.println(Bicicleta.quantidade);
        Bicicleta bicicleta = new Bicicleta("Monark", 30.0, 10.00);
        System.out.println(Bicicleta.quantidade);
        Bicicleta bicicleta2 = new Bicicleta("Modelo 2", 30.0, 10.00);
        System.out.println(Bicicleta.quantidade);
        bicicleta.alugar();
        bicicleta.devolver();
        bicicleta.alugar();
        
        System.out.println(bicicleta.calcularAluguelPorDias(10));
        System.out.println(bicicleta.calcularAluguelPorDias(10, 50));
    }
    
}