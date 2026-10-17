
import java.util.Scanner;

public class Main {

    /*
    Exercício Guiado
    A secretaria da escola quer digitalizar o boletim de uma turma de 5 alunos. Hoje, os dados estão espalhados 
    em arquivos separados (nomes, notas), e isso já causou vários problemas.
    Sua tarefa é criar um programa em Java que represente cada aluno como um elemento único (nome + três notas + comportamentos), 
    e que, ao final, exiba um relatório da turma no console com:
    1.	A ficha de cada aluno: nome, as três notas e a média.
    2.	Se o aluno está aprovado (média ≥ 6.0) ou reprovado.  
        
    3.	O nome do aluno com a maior média da turma.
    4.	A média geral da turma (média das médias de todos os alunos).
    
    5.	Uma busca: dado um nome digitado, mostrar a ficha daquele aluno (usando os métodos de String que vocês já conhecem).
    Saída esperada (exemplo com 3 alunos):
    

    
    === Ana Silva ===
    Notas: 7.5, 8.0, 6.5 | Média: 7.33 | Situação: Aprovado

    === Bruno Costa ===
    Notas: 4.0, 5.5, 6.0 | Média: 5.17 | Situação: Reprovado

    === Carla Dias ===
    Notas: 9.0, 8.5, 9.5 | Média: 9.00 | Situação: Aprovado

    Maior média da turma: Carla Dias (9.00)
    Média geral da turma: 7.17
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Alunoz turma[] = new Alunoz[3];
        turma[0] = new Alunoz();

        int cont = 0;

        do {
            Alunoz a = new Alunoz();
            System.out.print("Informe o nome: ");
            a.nome = in.nextLine();

            System.out.print("Nota 1: ");
            a.notas[0] = in.nextDouble();

            System.out.print("Nota 2: ");
            a.notas[1] = in.nextDouble();

            System.out.print("Nota 3: ");
            a.notas[2] = in.nextDouble();
            in.nextLine();

            a.calcularMedia();

            turma[cont] = a;

            cont++;
        } while (cont < turma.length);

        
        System.out.println("\nAlunos com maior media: ");
        double maiorMedia = descobrirMaiorMedia(turma);
        for (Alunoz a : turma) {
            if (a.media == maiorMedia) {
                a.relatorio();
            }
        }
        
        System.out.printf("\nMedia geral da Turma: %.2f", calcularMediaDaTurma(turma));
        String parametroDeBusca = "";
        do{
            System.out.print("\nBusque ficha de aluno pelo nome: ");
            parametroDeBusca = in.nextLine();
            boolean existeAlunoComNomePassadoComoParametroDeBusca = false;
            for (Alunoz a: turma){
                if(a.nome.toLowerCase().contains(parametroDeBusca.toLowerCase())){ 
                    a.relatorio();
                    existeAlunoComNomePassadoComoParametroDeBusca = true;
                }
            }
            if(!existeAlunoComNomePassadoComoParametroDeBusca) 
                System.out.println("Não há nenhum aluno que contenha " + parametroDeBusca + " no nome");
            
        } while(!parametroDeBusca.equalsIgnoreCase("sair"));
        
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    static double descobrirMaiorMedia(Alunoz turma[]) {
        double maiorMedia = 0;

        for (Alunoz a : turma) {
            if (a.media > maiorMedia) {
                maiorMedia = a.media;
            }
        }
        return maiorMedia;
    }
    
    static double calcularMediaDaTurma(Alunoz turma[]) {
        double soma = 0;
        double mediaGeralTurma = 0;
        for (int i = 0; i < turma.length; i++) {
            soma += turma[i].media;
        }
        mediaGeralTurma = soma / turma.length;
        return mediaGeralTurma;
    }

}
