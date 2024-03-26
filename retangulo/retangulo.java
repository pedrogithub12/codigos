package retangulo;

public class retangulo {
    public int base;
    public int altura;

   
    public int calcularArea() {
        int area = base * altura;
        return area;
    }

    public int calcularPerimetro() {
        int perim = base + base + altura + altura;
        return perim;
    }
}
