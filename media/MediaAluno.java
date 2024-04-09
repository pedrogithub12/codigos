package media;

import java.util.ArrayList;

public class MediaAluno {
    private ArrayList<Double> notas = new ArrayList<Double>();

    public void novaNota(double nota){
        notas.add(nota);
    }


    public double media(){
        double soma =0;
        for (Double nota : notas) {
            soma += nota;
        }
        double m = soma / notas.size();
        return(m);
    }
    public String Situacao(){
        String s = "";

        double m = media();
        if(m >= 6)
            s = "Aprovado";
        else
            s = "DP";

            return s;
        

    }
}
