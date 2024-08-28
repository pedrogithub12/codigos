package televisao;

// Classe para testar as funcionalidades
public class TesteTelevisaoControle {
    public static void main(String[] args) {
        // Criando uma nova televisão
        Televisao tv = new Televisao();

        // Criando um controle remoto para a televisão
        ControleRemoto controle = new ControleRemoto(tv);

        // Testando funcionalidades
        controle.aumentarVolume();
        controle.aumentarVolume();
        controle.diminuirVolume();
        controle.aumentarCanal();
        controle.aumentarCanal();
        controle.diminuirCanal();
        controle.trocarCanal(5);

        // Consultando valores
        System.out.println("Volume da Televisão: " + controle.obterVolume()); // Esperado: 11
        System.out.println("Canal da Televisão: " + controle.obterCanal());   // Esperado: 5
    }
}