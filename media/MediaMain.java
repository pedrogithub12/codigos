package media;

import java.util.Scanner;

public class MediaMain {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
            MediaAluno aluno = new MediaAluno();
            int opcao = 0;
        do {
            System.out.println("\n---");
            System.out.println("1. Nova nota");
            System.out.println("2. Analisar");
            System.out.println("0. Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                double n = lerDouble("Notas:: ");
                aluno.novaNota(n);
                break;

                case 2:
                double m = aluno.media();
                String s = aluno.Situacao();

                System.out.println("Média: " + m);
                System.out.println("Situação: " + s);
                break;
            }

        } while (opcao != 0);
    }
    public static double lerDouble(String msg) {
        System.out.println(msg);
        return scanner.nextDouble();
    }
    
    public static void escrever(String msg) {
        System.out.println(msg);
    }
}
