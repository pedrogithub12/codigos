package lista;

public class Lista {

    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();
        System.out.println("Tamanho da Lista = " + lista.getTamanho());
        
        lista.adiciona("Claudio");
        lista.adiciona("Camila");
        lista.adiciona("Miguel");
        lista.adiciona("Elis");
        
        System.out.println(lista);
        System.out.println("Tamanho da Lista = " + lista.getTamanho());
        System.out.println("Início da Lista = " + lista.getInicio().getElemento());
        System.out.println("Fim da Lista = " + lista.getFim().getElemento());
        
        System.out.println("Elemento na posição 2 = " + lista.get(2).getElemento());
        
        lista.remover("Elis");
        
        System.out.println(lista);
        System.out.println("Tamanho da Lista = " + lista.getTamanho());
        System.out.println("Início da Lista = " + lista.getInicio().getElemento());
        System.out.println("Fim da Lista = " + lista.getFim().getElemento());
    }
    
}
