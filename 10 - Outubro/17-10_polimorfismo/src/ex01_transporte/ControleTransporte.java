package ex01_transporte;

import java.util.ArrayList;
import java.util.Random;

public class ControleTransporte {

    private static ArrayList<Transporte> listaTransporte = new ArrayList<>();

    public static void main(String[] args) {
        Random gerador = new Random();

        for (int i = 0; i < 10000000; i++) {
            Transporte transporteAtual = null;
            int num = gerador.nextInt(0, 3);
            
            switch (num) {
                case 0:
                    transporteAtual = new Onibus(gerador.nextInt(0, 20), // quantidadeParadas
                            gerador.nextInt(20, 90), // capacidade
                            gerador.nextDouble(5.00, 200.00) // valorBase
                    );
                    break;
                case 1:
                    transporteAtual = new Taxi(gerador.nextDouble(0.1, 115), // quilometragem
                            gerador.nextInt(2, 6), // capacidade
                            gerador.nextDouble(8.00, 800.00) // valorBase
                    );
                    break;
                case 2:
                    transporteAtual = new Transporte(gerador.nextInt(1, 1000), // capacidade
                            gerador.nextDouble(1.00, 1000000.00) // valorBase
                    );
            }
            listaTransporte.add(transporteAtual);
        }

        mostrarTarifas();
    }

    public static void mostrarTarifas() {
        for (Transporte t : listaTransporte) {
            if(t instanceof Onibus) {
                System.out.print("Tarifa do Onibus: ");
            } else if(t instanceof Taxi) {
                System.out.print("Tarifa do Taxi: ");
            } else System.out.print("Tarifa do Transporte: ");
            
            System.out.printf("%.2f \n", t.calcularTarifa());
            
        }
    }
    
    
    

}
