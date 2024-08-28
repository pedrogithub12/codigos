package conta;
public class ContaCorrente {
    protected double saldo;

    public ContaCorrente(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double quantia) {
        saldo += quantia;
    }

    public void sacar(double quantia) {
        double taxa = 0.005; // 0,5%
        double total = quantia + (quantia * taxa);
        if (total <= saldo) {
            saldo -= total;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public double obterSaldo() {
        return saldo;
    }
}






