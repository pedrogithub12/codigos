package tarefa;

import java.util.Scanner;

public class MainTarefa {
    public static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        
        int opcao = 0;
        do {
            System.out.println("\nMENU");
            System.out.println("1. Nova tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Remover tarefa");
            System.out.println("4. Alterar tarefa");
            System.out.println("5. Marcar concluída");
            System.out.println("0. Sair");
            opcao = ler.nextInt();


            switch (opcao) {
                case 1:
                    System.out.println("\nTarefa: ");
                    ler.nextLine();
                    String desc = ler.nextLine();

                    System.out.println("\nCódigo: ");
                    String cod = ler.nextLine();

                    Tarefa novaTarefa = new Tarefa();
                    novaTarefa.descricao = desc;
                    novaTarefa.codigo = cod;
                    novaTarefa.concluida = false;
                    
                    gerenciador.novaTarefa(novaTarefa);

                    break;


                case 2:
                    gerenciador.listar();
                    break;


                case 3:
                    break;


                case 4:
                    break;


                case 5:
                    break;
            }
        }
        while (opcao != 0);
    }

}
