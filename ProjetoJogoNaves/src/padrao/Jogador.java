package padrao;

public interface Jogador {
    public void adicionarNaves(Inimigo inimigo);
    public void notificar();
    public void movimentarNave(Acoes acao);
}
