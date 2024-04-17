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
                    System.out.println("\nCodigo: ");
                    ler.nextLine();
                    String desc = ler.nextLine();

                    System.out.println("\nTarefa: ");
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
                System.out.println("\nPosição: ");
                int pos = ler.nextInt();

                gerenciador.remover(pos);
                    break;


                case 4:
                    System.out.println("\nPosição");
                    int pos3 = ler.nextInt();
                    
                    System.out.println("\nCodigo ");
                    String cod1 = ler.next();
                    ler.nextLine();

                    System.out.println("\nDescrição");
                    String desc1 = ler.nextLine();

                    gerenciador.alterar(pos3, cod1, desc1);

                    break;
                    

                case 5:
                System.out.println("\nPosição: ");
                int pos2 = ler.nextInt();

                gerenciador.concluir(pos2);
                    break;
            }
        }
        while (opcao != 0);
    }

}
