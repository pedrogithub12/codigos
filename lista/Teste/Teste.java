package lista.Teste;

import java.util.LinkedList;

public class Teste {
    public static void main(String[] args) {

        LinkedList<String> Lista = new LinkedList<String>();

        Lista.add("Claudio");
        Lista.add("Camila");
        Lista.add("Miguel");
        Lista.add("Elis");


        System.out.println(Lista);
        System.out.println("Tamanho da Lista = " + Lista.size());
        System.out.println("Inicio da Lista = " + Lista.getFirst());
        System.out.println("Fim da Lista = " + Lista.getLast());
        System.out.println("Buscar informacao na 2 posicao da lista: " + Lista.get(2));
        System.out.println("Buscar o nome Elis na lista: " + Lista.contains("Elis"));
        Lista.remove(2);
        Lista.remove("Claudio");
        System.out.println(Lista);
        System.out.println("Tamanho da Lista = " + Lista.size());
    }

}
