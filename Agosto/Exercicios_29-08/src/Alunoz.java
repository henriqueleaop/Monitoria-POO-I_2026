
public class Alunoz {

    String nome;
    double[] notas = new double[3];
    double media;
    boolean foiAprovado;

    void calcularMedia() {

        double soma = 0;
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        media = soma / notas.length;
        this.media = media;
        verificarSituacao();
    }

    void verificarSituacao() {
        //double media = calcularMedia();
        if (this.media >= 6.0) {
            this.foiAprovado = true;
        } else {
            this.foiAprovado = false;
        }
    }

    void relatorio() {

        System.out.println("=== " + this.nome + "===");
        System.out.print("Notas: " + this.notas[0] + ","
                + this.notas[1] + "," + this.notas[2] + " | ");
        System.out.printf("Media: %.2f | ", this.media);
        System.out.println("Situacao: " + (this.foiAprovado ? "Aprovado" : "Reprovado"));

    }

}
