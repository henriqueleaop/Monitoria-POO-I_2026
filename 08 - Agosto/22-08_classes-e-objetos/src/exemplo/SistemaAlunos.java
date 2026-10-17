package exemplo;

import java.util.Scanner;

public class SistemaAlunos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] nomes = new String[20];
        String[] matriculas = new String[20];
        double[] notas = new double[20];

        int quantidade = 0;
        int opcao = 0;

        System.out.println("================================");
        System.out.println("      SISTEMA DE ALUNOS");
        System.out.println("================================");

        while (opcao != 4) {

            System.out.println("\n1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Consultar aluno");
            System.out.println("4 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine();

            if (opcao == 1) {

                // CADASTRO
                System.out.println("\n--- CADASTRO DE ALUNO ---");

                System.out.print("Nome: ");
                String nome = entrada.nextLine();

                while (nome.trim().isEmpty()) {
                    System.out.println("Nome inválido!");
                    System.out.print("Digite novamente: ");
                    nome = entrada.nextLine();
                }

                System.out.print("Matrícula: ");
                String matricula = entrada.nextLine();

                System.out.print("Nota: ");
                double nota = entrada.nextDouble();
                entrada.nextLine();

                while (nota < 0 || nota > 10) {
                    System.out.println("A nota deve estar entre 0 e 10.");
                    System.out.print("Digite novamente: ");
                    nota = entrada.nextDouble();
                    entrada.nextLine();
                }

                nomes[quantidade] = nome.trim();
                matriculas[quantidade] = matricula.trim();
                notas[quantidade] = nota;

                quantidade++;

                System.out.println("Aluno cadastrado com sucesso!");

            } else if (opcao == 2) {

                // LISTAGEM
                System.out.println("\n--- ALUNOS CADASTRADOS ---");

                if (quantidade == 0) {

                    System.out.println("Nenhum aluno cadastrado.");

                } else {

                    for (int i = 0; i < quantidade; i++) {

                        System.out.println("\nAluno " + (i + 1));
                        System.out.println("Nome: " + nomes[i]);
                        System.out.println("Matrícula: " + matriculas[i]);
                        System.out.println("Nota: " + notas[i]);

                        if (notas[i] >= 6) {
                            System.out.println("Situação: Aprovado");
                        } else {
                            System.out.println("Situação: Reprovado");
                        }
                    }
                }

            } else if (opcao == 3) {

                // CONSULTA
                System.out.println("\n--- CONSULTAR ALUNO ---");

                System.out.print("Digite a matrícula: ");
                String busca = entrada.nextLine();

                boolean encontrado = false;

                for (int i = 0; i < quantidade; i++) {

                    if (matriculas[i].equalsIgnoreCase(busca)) {

                        System.out.println("\nAluno encontrado!");
                        System.out.println("Nome: " + nomes[i]);
                        System.out.println("Matrícula: " + matriculas[i]);
                        System.out.println("Nota: " + notas[i]);

                        encontrado = true;
                    }
                }

                if (!encontrado) {
                    System.out.println("Aluno não encontrado.");
                }

            } else if (opcao == 4) {

                System.out.println("\nEncerrando o sistema...");

            } else {

                System.out.println("\nOpção inválida!");
            }
        }

        entrada.close();
    }
}
