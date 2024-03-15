class App {
    

    public static void main(String[] args) {
        Boletim bo = new Boletim();
        Tela tela = new Tela();

        tela.escrever("### PROGRAMA DA MÉDIA ###");

        double nota1 = tela.pedirDouble("Informe a primeira nota");
        double nota2 = tela.pedirDouble("Informe a seguda nota");
        double nota3 = tela.pedirDouble("Informe a terceira nota");
        int faltas = tela.pedirInt("Informe a qtd de faltas");

        double media = bo.calcularMedia(nota1, nota2, nota3);
        String sit = bo.verificarSituacao(media, faltas);

        tela.formatar("\nA média do aluno é %.2f. \n", media);
        tela.formatar("Situação: %s ", sit);
    }
    


}