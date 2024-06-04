package parEimpar;

import java.util.ArrayList;

public class PI {
    private ArrayList<Integer> nm = new ArrayList<Integer>();

    public void NovoNumero(int numero){
        nm.add(numero);

    }
  
    public void VerificarPI(){
        for (int numero : nm) {
            if (numero % 2 ==0) {
                System.out.println("O numero " + numero + " é par: ");
            }else{
                System.out.println("O numero " + numero + " é impar");
            }
        }
    }
    public void ListarNumeros(){
        System.out.println("Numeros Digitados: ");
        for (int numero : nm) {
            System.out.println(numero);
        }
    }
}
