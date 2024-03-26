package retangulo;

import java.util.Scanner;

public class mainretangulo {
    public static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
         

       
        System.out.println("Informe a altura do retangulo:");
        int altura = ler.nextInt();
       
        System.out.println("Informe a base do retangulo:");
        int base = ler.nextInt();
       

        retangulo ret = new retangulo();
        ret.altura = altura;
        ret.base = base;

        int area = ret.calcularArea();
        int perim = ret.calcularPerimetro();

        System.out.println("A área é " + area);
        System.out.println("O perímetro é " + perim);
    }
}
