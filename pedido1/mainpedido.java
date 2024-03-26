package pedido1;

import java.util.Scanner;

public class mainpedido {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Valor Pedido: ");
        double v = scanner.nextDouble();

        System.out.println("Parcelas: ");
        int p = scanner.nextInt();

        System.out.println("Cupom: ");
        String c = scanner.next();
       

        Pedido pedido = new Pedido();
        pedido.valor = v;
        pedido.parcelas = p;
        pedido.cupom = c;


        Resultado res = pedido.calcularTotal();

        System.out.println("Total: " + res.totalFinal);
        System.out.println("Desc.: " + res.desconto);
        System.out.println("Juros: " + res.juros);


       
       
    
    }
}
