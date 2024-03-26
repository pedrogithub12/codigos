 package soma;

import java.util.Scanner;

class mainSoma {
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Insira o primeiro valor");
        double n1 = scanner.nextDouble();
        System.out.println("Insira o segundo valor");
        double n2 = scanner.nextDouble();
        System.out.println("Insira o terceiro valor");
        double n3 = scanner.nextDouble();
        
        Soma med = new Soma();

        med.n1 = n1;
        med.n2 = n2;
        med.n3 = n3;
        
        double total = med.calcularMedia();

        System.out.println("O resultado é: " + total);

    }
}