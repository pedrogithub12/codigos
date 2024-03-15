package aulas_2_semestre;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Informe as notas do aluno:");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        System.out.println("Informe a quantidade de faltas do aluno:");
        int faltas = scanner.nextInt();

        Aluno aluno = new Aluno(nota1, nota2, nota3, faltas);

        System.out.println("Média do aluno: " + aluno.calcularMedia());
        System.out.println("Situação do Aluno: " + aluno.verificarSituacao());

        scanner.close();
   }
}
