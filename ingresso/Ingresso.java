package ingresso;

public class Ingresso {
    public int qtdInteiras;
    public int qtdMeias;

    public double calcular() {
        double preco = 30;
       
        double total = (preco * qtdInteiras) + (preco/2 * qtdMeias);
        return total;
    }
}
