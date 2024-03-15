package aulas_2_semestre;

import java.util.Scanner;

public class media01_1 {
    
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        double n1, n2, n3, media ;
        int qtdfaltas;
     
        System.out.println("Insira a primeira nota: ");
        n1 = scanner.nextDouble();
        System.out.println("Insira a secunda nota: ");
        n2 = scanner.nextDouble();
        System.out.println("Insira a terceira nota: ");
        n3 = scanner.nextDouble();
        System.out.println("Insira a quantidade de faltas");
        qtdfaltas = scanner.nextInt();

        media = (n1 + n2 + n3) / 3;

    
        if (media <3) {
            if (qtdfaltas >4) {
                System.out.println("Você esta reprovado");  
            }else {
               System.out.println("DP por falta");
            } if (media >=6 && media <8) {
                System.out.println("Você esta aprovado");   
            }else if (qtdfaltas >4) {
                System.out.println("DP por falta");
            }else if (media >= 3 && media <6) {
                System.out.println("Você esta de recuperação");
            }else if (qtdfaltas >4) {
                System.out.println("DP por falta");
            }else if(media >=8){
                System.out.println("Você esta aprovado com sucesso"); 
            }else{
                System.out.println("Desistente");
            }
          
        }

        System.out.printf("**Notas:**∖n" + "Primeira nota: %.2f∖n" + "Segunda nota: %.2f∖n" + "Primeira nota: %.2f∖n∖n" + "**Média:** %.2f∖n∖n" + "**Situação:**∖n", n1,n2,n3,media);

    }
}
