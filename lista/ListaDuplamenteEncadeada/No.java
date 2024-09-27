package lista.ListaDuplamenteEncadeada;

public class No<Tipo> {
    private Tipo elemento;
    private No<Tipo> proximo;
    private No<Tipo> anterior;

    public No(Tipo elemento) {
        this.elemento = elemento;
        this.proximo = null;
        this.anterior = null;
    }

    public No(Tipo elemento, No<Tipo> proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
        this.anterior = anterior;
    }

    public Tipo getElemento() {
        return elemento;
    }

    public void setElemento(Tipo elemento) {
        this.elemento = elemento;
    }

    public No<Tipo> getProximo() {
        return proximo;
    }

    public No<Tipo> getAnterior(){
        return anterior;
    }

    public void setProximo(No<Tipo> proximo) {
        this.proximo = proximo;
    }

    public void setAnterior(No<Tipo> anterior){
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return "No{" + "elemento=" + elemento + ", proximo=" + proximo + '}';
    }
    
    
    
}
