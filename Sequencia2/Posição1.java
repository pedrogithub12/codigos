package Sequencia2;

import java.util.ArrayList;
import java.util.Scanner;

public class Posição1 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<Double>();

        double nt =0;

        do {
            System.out.println("Informe a nota. ( -1 para sair )");
            nt = scanner.nextDouble();

            if (nt != -1) {
                notas.add(nt);
            }
            /*o símbolo "!=" é um operador de comparação que significa "não igual a". 
             verifica se os dois valores são diferentes entre si 
            */
        } while (nt != -1);

        System.out.println("--Notas Informadas--");
        for (Double nota : notas) {
            System.out.println(nota);
        }
    }
}
