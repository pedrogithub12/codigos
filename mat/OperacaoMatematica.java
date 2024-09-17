package mat;

abstract class OperacaoMatematica {
    public abstract double calcular(double x, double y);
}

class Soma extends OperacaoMatematica {
    public double calcular(double x, double y) {
        return x + y;
    }
}

class Subtracao extends OperacaoMatematica {
    public double calcular(double x, double y) {
        return x - y;
    }
}
