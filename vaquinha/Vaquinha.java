package vaquinha;

public class Vaquinha {
    public String objetivo;
    public double meta;
    public double arrecadado;

    public void doar(double valor){
        this.arrecadado += valor;
    }
    public void analiar(){
        double porcent = this.arrecadado / this.meta * 100;

        System.out.printf("\nPara o objetivo [%s] \n" , this.objetivo);
        System.out.printf("Meta: %.2f \n" , this.meta);
        System.out.printf("Alcance: %.2f%% \n" , porcent);
    }
}
