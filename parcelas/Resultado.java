package parcelas;

public class Resultado {
    double total;
    double juros;
    public int desconto;
    public Object programaBolsa;
    public Resultado(double total, double juros){
        this.juros = juros;
        this.total = total;
    }
}
