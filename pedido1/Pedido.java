package pedido1;

public class Pedido {
    public double valor;
    public int parcelas;
    public String cupom;

    public Resultado calcularTotal() {
        Resultado res = new Resultado();

        // verificar juros
        if (parcelas == 1) {
            res.juros = 0;
        }
        else {
            res.juros = (valor * 10 / 100.0);
        }


        // verificar desconto
        if (cupom.equals("senac50")) {
            res.desconto = 50;
        }
        else if (cupom.equals("senac100")) {
            res.desconto = 100;
        }

        res.totalFinal = valor + res.juros - res.desconto;
        return res;

        
    }
   
    
}
    public class Resultado {
   
    public double totalFinal;
    public double desconto;
    public double juros;

}

