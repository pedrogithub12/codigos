package padrao;

public class NaveInimiga implements Inimigo{
    private String nome;
    private Acoes acao;

    public NaveInimiga(String nome){
        this.nome=nome;
    }



    @Override
    public void atualizar(Acoes acao) {
     this.acao=acao;
        System.out.println(nome + ": acao: " + acao);
    }

    @Override
    public void observar(Jogador jogador) {
        jogador.adicionarNaves(this);
    }
}
