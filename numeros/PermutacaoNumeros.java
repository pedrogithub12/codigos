package numeros;

import java.util.Arrays;
import java.util.Scanner;

public class PermutacaoNumeros {

    // Método para verificar se dois números são permutações
    public static boolean saoPermutacoes(int num1, int num2) {
        // Convertendo os números para strings
        String str1 = Integer.toString(num1);
        String str2 = Integer.toString(num2);

        // Verificando se os comprimentos são diferentes
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convertendo as strings em arrays de caracteres
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Ordenando os arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Comparando os arrays ordenados
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebendo os números do usuário
        System.out.print("Digite o primeiro número (positivo): ");
        int numero1 = scanner.nextInt();
        if (numero1 <= 0) {
            System.out.println("O número deve ser positivo.");
            return;
        }

        System.out.print("Digite o segundo número (positivo): ");
        int numero2 = scanner.nextInt();
        if (numero2 <= 0) {
            System.out.println("O número deve ser positivo.");
            return;
        }

        // Verificando se os números são permutações
        if (saoPermutacoes(numero1, numero2)) {
            System.out.println(numero1 + " é permutação de " + numero2);
        } else {
            System.out.println(numero1 + " não é permutação de " + numero2);
        }

        scanner.close();
    }
}

