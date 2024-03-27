package partidaBasquete;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        partidaBasquete pb = new partidaBasquete();
        Resultado res = new Resultado();

        System.out.println("Qual é o time mandante?");
        pb.mandante = scan.nextLine();

        System.out.println("Qual é o time visitante?");
        pb.visitante = scan.nextLine();
        int menu;

        do{
            boolean mv;
            System.out.println("\nMENU");
            System.out.println("1. Nova cesta");
            System.out.println("2. Encerrar");
            menu = scan.nextInt();

            switch(menu){
                case 1:
                System.out.println("Qual time fez cesta?");
                scan.nextLine();
                String timeCesta = scan.nextLine();
                if(timeCesta.equals(pb.mandante)){
                    mv = true;
                }else{
                    mv = false;
                }
                System.out.println("Quantos pontos foi a cesta?");
                int pontos = scan.nextInt();
                pb.cesta(mv,pontos);
                break;

                case 2:
                res = pb.encerrrar();
            }

        }while(menu != 2);
        System.out.println("O time ganhador foi " + res.vencedor+ " com " + res.pontosVencedor + " pontos, contra " + res.pontosPerdedor);

    }
    
}
