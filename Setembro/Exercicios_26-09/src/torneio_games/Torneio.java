
package torneio_games;

public class Torneio {

    public static void main(String[] args) {
        Jogador j1 = new Jogador("Primeiro Jogador");
        Jogador j2 = new Jogador("Segundo Jogador");
        
        j1.exibir();
        j1.registrarPontuacao(3);
        
        j2.exibir();
        j2.registrarPontuacao(8);
        
        j1.exibir();
        j1.registrarPontuacao(5, true);
        j1.exibir();
        
        j2.exibir();
        j2.registrarPontuacao(5);
        j2.exibir();
        
        
        System.out.println("Maior Pontuacao: " + Jogador.getMaiorPontuacao());
        
    }
    
}
