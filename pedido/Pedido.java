package pedido;

public class Pedido {
    public double valor;
    public int parcelas;
    public String cupom;

    public double calcularTotal() {
        double total = 0;

        // verificar juros
        if (parcelas == 1) {
            total = valor;
        }
        else {
            double juros = (valor * 10 / 100.0);
            total = valor + juros;
        }


        // verificar desconto
        if (cupom.equals("senac50")) {
            total = total - 50;
        }
        else if (cupom.equals("senac100")) {
            total = total - 100;
        }

        return total;
    }
}
