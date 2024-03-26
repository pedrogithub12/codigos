package quadrado;

import java.util.Scanner;

public class mainquadrado {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Informe o lado do quadrado:");
        int lado = scanner.nextInt();

        quadrado q = new quadrado();
        q.lado = lado;

        q.analisar();

        System.out.println("Area: " + q.area);
        System.out.println("Perimetro: " + q.perimetro);

    }
}
