package pessoa;

public class Pessoa {
    public double peso;
    public double altura;

    public double imc() {
        double imc = peso / (altura * altura);
        return imc;
    }
}
