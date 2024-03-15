package aulas_2_semestre;

import java.util.Scanner;

public class aula1 {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        double n1 = pedirNota("Informe a primeira nota:");
        double n2 = pedirNota("Informe a segunda nota:");
        double n3 = pedirNota("Informe a terceira nota:");

        double media = calcularMedia(n1, n2, n3);
        String sit = verificarSituacao(media);

        escrever("A média é " + media);
        escrever("Situação: " + sit);
    }


    public static void escrever(String msg) {
        System.out.println(msg);
    }


    public static double pedirNota(String msg) {
        escrever(msg);
        double nota = ler.nextDouble();
        return nota;
    }

    
    public static double calcularMedia(double n1, double n2, double n3) {
        double media = (n1 + n2 + n3) / 3;
        return media;
    }

    public static String verificarSituacao(double media) {
        String sit = "";
        if (media >= 6)
            sit = "Aprovado";
        else 
            sit = "Reprovado";

        return sit;
    }
    
    

}
