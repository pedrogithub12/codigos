package abreviatura;

import java.util.Scanner;

public class AbreviaturaNome {

    // Método para criar a abreviatura do nome
    public static String criarAbreviatura(String nomeCompleto) {
        // Divide o nome completo em palavras
        String[] palavras = nomeCompleto.split("\\s+");
        StringBuilder abreviatura = new StringBuilder();

        for (String palavra : palavras) {
            // Adiciona a inicial da palavra se ela tiver mais de 2 letras
            if (palavra.length() > 2) {
                abreviatura.append(palavra.charAt(0)).append(". ");
            } else {
                // Adiciona a palavra completa se ela tiver 2 letras ou menos
                abreviatura.append(palavra).append(" ");
            }
        }

        // Remove o espaço extra no final da string
        return abreviatura.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebe o nome completo do usuário
        System.out.print("Digite o nome completo: ");
        String nomeCompleto = scanner.nextLine();

        // Cria a abreviatura
        String abreviatura = criarAbreviatura(nomeCompleto);

        // Exibe a abreviatura
        System.out.println("Abreviatura: " + abreviatura);

        scanner.close();
    }
}

