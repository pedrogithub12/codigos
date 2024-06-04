package universidade;

import java.util.Scanner;

public class Main {
      public static Scanner scanner = new Scanner(System.in);
      public static void main(String[] args) {

       // Entrada de dados

       System.out.println("Digite o codigo do curso");
       int codCurso = scanner.nextInt();  


       System.out.println("Digite o codigo da bolsa");
       int codBolsa = scanner.nextInt(); 

       Opcoes opcoes = new Opcoes(codCurso, codBolsa);
       Universidade universidade = new Universidade();
       Resultado resultado = universidade.calcularMensalidade(opcoes);

       // Saída de dados
       System.out.printf("Você teve %.0f%% de desconto pelo programa de %s no curso %s, a parcela será R$ %.2f\n", 
           resultado.desconto * 100, resultado.programaBolsa, resultado.curso, resultado.mensalidade);
    }
}
