package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExecString {

    // Método para contar ocorrências da substring na string principal
    public static int contarOcorrencias(String str, String sub) {
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length(); // Move o índice para após o substring encontrado
        }

        return count;
    }

    // Método para contar caracteres em uma string
    public static Map<Character, Integer> contarCaracteres(String str) {
        Map<Character, Integer> contador = new HashMap<>();
        for (char c : str.toCharArray()) {
            contador.put(c, contador.getOrDefault(c, 0) + 1);
        }
        return contador;
    }

    // Método para exibir estatísticas dos caracteres
    public static void exibirEstatisticas(Map<Character, Integer> contador1, Map<Character, Integer> contador2) {
        Map<Character, Integer> estatisticas = new HashMap<>(contador1);
        for (Map.Entry<Character, Integer> entry : contador2.entrySet()) {
            estatisticas.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }

        System.out.println("Estatísticas dos caracteres nas duas strings:");
        for (Map.Entry<Character, Integer> entry : estatisticas.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebendo as duas strings do usuário
        System.out.print("Digite a primeira string: ");
        String primeiraString = scanner.nextLine();

        System.out.print("Digite a segunda string: ");
        String segundaString = scanner.nextLine();

        // Contando ocorrências da segunda string na primeira
        int ocorrencias = contarOcorrencias(primeiraString, segundaString);
        System.out.println("A segunda string ocorre " + ocorrencias + " vez(es) na primeira string.");

        // Contando caracteres nas duas strings
        Map<Character, Integer> contadorPrimeira = contarCaracteres(primeiraString);
        Map<Character, Integer> contadorSegunda = contarCaracteres(segundaString);

        // Exibindo estatísticas
        exibirEstatisticas(contadorPrimeira, contadorSegunda);

        scanner.close();
    }
}

