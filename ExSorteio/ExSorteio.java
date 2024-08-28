package ExSorteio;

import java.util.Random;
import java.util.Scanner;

public class ExSorteio {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Sorteia um número entre 0 e 1000
        int numeroSorteado = random.nextInt(1001); // 1001 é exclusivo, então vai de 0 a 1000
        int palpite;
        int tentativas = 0;

        System.out.println("Tente adivinhar o número sorteado entre 0 e 1000.");

        // Loop até o usuário acertar
        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSorteado) {
                System.out.println("O palpite é menor que o número sorteado.");
            } else if (palpite > numeroSorteado) {
                System.out.println("O palpite é maior que o número sorteado.");
            } else {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
            }

        } while (palpite != numeroSorteado);

        scanner.close();
    }
}
