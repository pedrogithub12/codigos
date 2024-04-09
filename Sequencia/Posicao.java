package Sequencia;

import java.util.ArrayList;
import java.util.Scanner;

public class Posicao {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        ArrayList<Double> notas = new ArrayList<Double>();

        System.out.println("Qauntas notas?: ");
        int sq = scanner.nextInt();


        for(int i =0; i < sq; i++){
            System.out.println("Informe a nota da posição: " + i);
            notas.add(scanner.nextDouble());
        }

        System.out.println(" --Notas-- ");
        for (Double nt : notas) {
            System.out.println(nt);
        }

    }
}
