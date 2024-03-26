package ingresso;

import java.util.Scanner;

public class mainingresso {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Informe a qtd. de ingressos INTEIRAS:");
        int inteiras = scanner.nextInt();

        System.out.println("Informe a qtd. de ingressos MEIAS:");
        int meias = scanner.nextInt();

       
        Ingresso ing = new Ingresso();
        ing.qtdInteiras = inteiras;
        ing.qtdMeias = meias;

        double total = ing.calcular();

        System.out.println("Total: " + total);
       
    }
}
