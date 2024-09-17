package mat;

public class Matematica {
    public static void main(String args[]) {
        Matematica.mostrarCalculo(new Soma(), 5, 5);
        Matematica.mostrarCalculo(new Subtracao(), 5, 2);
        Matematica.mostrarCalculo(new Multiplicacao(), 5, 2);
        Matematica.mostrarCalculo(new Divisao(), 5, 2);
    }

    public static void mostrarCalculo(OperacaoMatematica operacao, double x, double y) {
        System.out.println("O resultado é: " + operacao.calcular(x, y));
    }
}


