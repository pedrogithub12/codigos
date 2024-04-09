package temperaturas;

import java.util.ArrayList;

public class Temperatura {
    
    private ArrayList<Double> temperaturas = new ArrayList<Double>();

    public void pedirTemperatura(double tempCelsius){
        double tempFahrenheit = (9.0 / 5.0) * tempCelsius + 32;
        temperaturas.add(tempFahrenheit);
    }

    public double calculo(){
        double conversão = 0;
        for (Double temp1 : temperaturas) {
            conversão += temp1;
        }
        double conv = conversão / temperaturas.size();
        return(conv);
    }
    

}
