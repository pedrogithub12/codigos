package tarefa;

import java.util.ArrayList;

public class GerenciadorTarefas {
    private ArrayList<Tarefa> tarefas = new ArrayList<Tarefa>();

    public void novaTarefa(Tarefa novaTarefa) {
        tarefas.add(novaTarefa);
    }

    public void listar() {
        
        for (Tarefa tarefa : tarefas) {
            int cont =1;
            System.out.printf("%d. (%s) %s - %s \n",
                cont++,
                tarefa.concluida ? "x" : " ",
                tarefa.codigo,
                tarefa.descricao);
        }
    }
    public void remover(int posicao){
        tarefas.remove(posicao -1);
    }
    public void alterar(int posicao, String codigo, String descricao){
        
        Tarefa t = tarefas.get(posicao -1);
        t.codigo = codigo;
        t.descricao = descricao;


    }
    public void concluir(int posicao){
        Tarefa t = tarefas.get(posicao -1);
        t.concluida = true;
    }
}
