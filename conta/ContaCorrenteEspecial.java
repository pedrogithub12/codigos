package conta;
public class ContaCorrenteEspecial extends ContaCorrente {

    public ContaCorrenteEspecial(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void sacar(double quantia) {
        double taxa = 0.001; // 0,1%
        double total = quantia + (quantia * taxa);
        if (total <= saldo) {
            saldo -= total;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}