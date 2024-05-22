package desenharQuadrado;

import java.util.Scanner;

public class DesenharQuadrado {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
     int ult =3;
     linha(ult);

    }
    public static void linha(int tam){
        if (tam != 0) {
            System.out.println("******");
            linha(tam -1);
        }
    }
}
