package principal;

import padrao.*;

public class RealizarCompras {
    public static void main(String[] args) {
        Produto produto1 = new Item("Caneta 1",  4.0);
        Produto produto2 = new Item("Caneta 2",  4.0);
        Produto produto3 = new Item("Caneta 3",  4.0);

        Kit kit1 = new Kit("Kit1");
        kit1.adicionar(produto1);
        kit1.adicionar(produto2);
        kit1.adicionar(produto3);

        Kit kit2 = new Kit("Kit2");
        kit2.adicionar(new Item("Borracha", 5.0));
        kit2.adicionar(new Item("Regua", 10.0));
        kit2.adicionar(kit1);


        System.out.println(kit2);
        System.out.println("Total: R$" +kit2.getPreco());


    }

}
