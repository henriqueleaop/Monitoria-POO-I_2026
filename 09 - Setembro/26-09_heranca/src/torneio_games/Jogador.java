package torneio_games;

public class Jogador {

    private static int maiorPontuacao = 0;

    private String nome;
    private int pontuacao;

    public Jogador(String nome) {
        this.nome = nome;
        this.pontuacao = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void registrarPontuacao(int pontos) {
        this.pontuacao += pontos;
        if (this.pontuacao > maiorPontuacao) {
            maiorPontuacao = this.pontuacao;
        }
    }

    public void registrarPontuacao(int pontos, boolean bonus) {
        if (bonus) {
            pontos *= 2;
        }
        registrarPontuacao(pontos);
    }

    public void exibir() {
        System.out.println("Pontuacao do " + getNome() + ": " + getPontuacao());
    }
    
    public static int getMaiorPontuacao(){
        return maiorPontuacao;
    }
}
