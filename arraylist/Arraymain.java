package arraylist;

import java.util.ArrayList;

public class Arraymain {
    public static void main(String[] args) {
        
        ArrayList<String> Personagem = new ArrayList<String>();
        Personagem.add("Olá"); //indice 0
        Personagem.add("Tudo bem? ");   //indice 1
        Personagem.add("Já faz muito tempo ne? ");  //indice 3
        Personagem.add("Vdd, faz mesmo");   //indice 4

        for (String perso : Personagem) {
            System.out.println(perso);
        }
    }
}
 