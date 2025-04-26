package padrao;

import java.util.ArrayList;
import java.util.List;

public class NaveJogador implements Jogador{

    private String nome;
    private Acoes acao;
    private List<Inimigo> lista;

    public NaveJogador(String nome){
        this.nome=nome;
        lista = new ArrayList<>();
    }

    @Override
    public void adicionarNaves(Inimigo inimigo) {
        lista.add(inimigo);
    }

    @Override
    public void notificar() {
        for(Inimigo inimigo:lista){
            inimigo.atualizar(acao);
        }
    }

    @Override
    public void movimentarNave(Acoes acao) {
        this.acao=acao;
        notificar();
    }
}
