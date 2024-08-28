package televisao;

// Classe Televisao
public class Televisao {
    private int volume;
    private int canal;

    public Televisao() {
        this.volume = 10; // Volume inicial padrão
        this.canal = 1;   // Canal inicial padrão
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        if (canal > 1) {
            canal--;
        }
    }

    public void trocarCanal(int novoCanal) {
        if (novoCanal > 0) {
            canal = novoCanal;
        }
    }

    public int obterVolume() {
        return volume;
    }

    public int obterCanal() {
        return canal;
    }
}

