package conta;

// Classe para testar as contas
public class TesteContas {
    public static void main(String[] args) {
        // Testando Conta Corrente
        ContaCorrente conta1 = new ContaCorrente(1000);
        conta1.depositar(500);
        conta1.sacar(200);
        System.out.println("Saldo da Conta Corrente: R$" + conta1.obterSaldo()); // Esperado: 1297,00

        // Testando Conta Corrente Especial
        ContaCorrenteEspecial conta2 = new ContaCorrenteEspecial(1000);
        conta2.depositar(500);
        conta2.sacar(200);
        System.out.println("Saldo da Conta Corrente Especial: R$" + conta2.obterSaldo()); // Esperado: 1298,00
    }
}