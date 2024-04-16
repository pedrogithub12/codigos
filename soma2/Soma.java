package soma;

import java.util.ArrayList;

public class Soma {
    private ArrayList<Double> soma = new ArrayList<Double>();

    public void inserirNumeros(double somatoria){
        soma.add(somatoria);
    }
    
    public double calculo(){
        double resultado = 0;
        for (Double num : soma) {
            resultado += num;
        }
        return resultado;
    }
    public double Multiplicação(){
        if (soma.isEmpty()) {
            return 0;
        }
        double resultado =1;
        for (Double num : soma) {
            resultado *= num;
        }
        return resultado;
    }
    public void exibirResultados(){
        System.out.println("--Resultados--");
        for(int i =0; i < soma.size(); i++){
            System.out.println((i + 1) + ". " + soma.get(i));
        }
        
     }
}
