package tarefa;

import java.util.ArrayList;

public class GerenciadorTarefas {
    private ArrayList<Tarefa> tarefas = new ArrayList<Tarefa>();

    public void novaTarefa(Tarefa novaTarefa) {
        tarefas.add(novaTarefa);
    }

    public void listar() {
        for (Tarefa tarefa : tarefas) {
            System.out.printf("(%s) %s - %s \n",
                tarefa.concluida ? "x" : " ",
                tarefa.codigo,
                tarefa.descricao);
        }
    }
    public void remover(int posicao){

    }
    public void alterar(int posicao, String codigo, String descricao){
    
    }
    public void concluir(int posicao){
    
    }
}
