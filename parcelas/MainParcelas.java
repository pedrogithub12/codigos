package parcelas;

import java.util.Scanner;

public class MainParcelas {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Insira o preco do veiculo: ");
        double preco = scanner.nextDouble();

        System.out.println("Digite a quantidade de parcelas: ");
        int parcelas = scanner.nextInt();


        // Cria um objeto Veiculo com o preço e o número de parcelas
        Veiculos carro = new Veiculos(preco, parcelas);

        // Cria um objeto Concessionaria que será responsável pelo cálculo
        Concessionaria concessionaria = new Concessionaria();

        // Usa o objeto Concessionaria para calcular o total com juros para o veículo
        Resultado resultado = concessionaria.calcularTotal(carro);

        double valorParcela = resultado.total / parcelas;

        System.out.printf("Seu carro no valor de R$ %.2f ficou em %dx de R$ %.2f\n", carro.preco, parcelas, valorParcela);
    }
}
