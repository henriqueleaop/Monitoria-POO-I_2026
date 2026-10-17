package exemplo;

import java.util.Scanner;

public class SistemaAlunoRefatoradooc {
    
    
    public static void main(String[] args) {
 
        Scanner entrada = new Scanner(System.in);
 
        String[] nomes = new String[20];
        String[] matriculas = new String[20];
        double[] notas = new double[20];
 
        int quantidade = 0;
        int opcao;
 
        exibirCabecalho();
 
        do {
            exibirMenu();
            opcao = lerOpcao(entrada);
 
            switch (opcao) {
                case 1:
                    quantidade = cadastrarAluno(entrada, nomes, matriculas, notas, quantidade);
                    break;
                case 2:
                    listarAlunos(nomes, matriculas, notas, quantidade);
                    break;
                case 3:
                    consultarAluno(entrada, nomes, matriculas, notas, quantidade);
                    break;
                case 4:
                    System.out.println("\nEncerrando o sistema...");
                    break;
                default:
                    System.out.println("\nOpção inválida!");
            }
 
        } while (opcao != 4);
 
        entrada.close();
    }
 
    // ---------- MENU ----------
 
    static void exibirCabecalho() {
        System.out.println("================================");
        System.out.println("      SISTEMA DE ALUNOS");
        System.out.println("================================");
    }
 
    static void exibirMenu() {
        System.out.println("\n1 - Cadastrar aluno");
        System.out.println("2 - Listar alunos");
        System.out.println("3 - Consultar aluno");
        System.out.println("4 - Sair");
        System.out.print("Escolha uma opção: ");
    }
 
    static int lerOpcao(Scanner entrada) {
        int opcao = entrada.nextInt();
        entrada.nextLine();
        return opcao;
    }
 
    // ---------- CADASTRO ----------
 
    static int cadastrarAluno(Scanner entrada, String[] nomes, String[] matriculas, double[] notas, int quantidade) {
 
        System.out.println("\n--- CADASTRO DE ALUNO ---");
 
        String nome = lerNomeValido(entrada);
        String matricula = lerMatricula(entrada);
        double nota = lerNotaValida(entrada);
 
        nomes[quantidade] = nome;
        matriculas[quantidade] = matricula;
        notas[quantidade] = nota;
 
        System.out.println("Aluno cadastrado com sucesso!");
 
        return quantidade + 1;
    }
 
    static String lerNomeValido(Scanner entrada) {
        System.out.print("Nome: ");
        String nome = entrada.nextLine().trim();
 
        while (nome.isEmpty()) {
            System.out.println("Nome inválido!");
            System.out.print("Digite novamente: ");
            nome = entrada.nextLine().trim();
        }
        return nome;
    }
 
    static String lerMatricula(Scanner entrada) {
        System.out.print("Matrícula: ");
        return entrada.nextLine().trim();
    }
 
    static double lerNotaValida(Scanner entrada) {
        System.out.print("Nota: ");
        double nota = entrada.nextDouble();
        entrada.nextLine();
 
        while (nota < 0 || nota > 10) {
            System.out.println("A nota deve estar entre 0 e 10.");
            System.out.print("Digite novamente: ");
            nota = entrada.nextDouble();
            entrada.nextLine();
        }
        return nota;
    }
 
    // ---------- LISTAGEM ----------
 
    static void listarAlunos(String[] nomes, String[] matriculas, double[] notas, int quantidade) {
 
        System.out.println("\n--- ALUNOS CADASTRADOS ---");
 
        if (quantidade == 0) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }
 
        for (int i = 0; i < quantidade; i++) {
            System.out.println("\nAluno " + (i + 1));
            exibirDadosBasicos(nomes[i], matriculas[i], notas[i]);
            System.out.println("Situação: " + calcularSituacao(notas[i]));
        }
    }
 
    static String calcularSituacao(double nota) {
        return (nota >= 6) ? "Aprovado" : "Reprovado";
    }
 
    // ---------- CONSULTA ----------
 
    static void consultarAluno(Scanner entrada, String[] nomes, String[] matriculas, double[] notas, int quantidade) {
 
        System.out.println("\n--- CONSULTAR ALUNO ---");
        System.out.print("Digite a matrícula: ");
        String busca = entrada.nextLine();
 
        boolean encontrado = false;
 
        for (int i = 0; i < quantidade; i++) {
            if (matriculas[i].equalsIgnoreCase(busca)) {
                System.out.println("\nAluno encontrado!");
                exibirDadosBasicos(nomes[i], matriculas[i], notas[i]);
                encontrado = true;
            }
        }
 
        if (!encontrado) {
            System.out.println("Aluno não encontrado.");
        }
    }
 
    // ---------- AUXILIAR COMPARTILHADO ----------
 
    static void exibirDadosBasicos(String nome, String matricula, double nota) {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota: " + nota);
    }
    

    
}
