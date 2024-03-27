package outback;

import java.util.Scanner;

public class mainMesa {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Mesa ms = new Mesa();
    NotaFiscal nf = new NotaFiscal();
    int menu = 0;
    String desc;
    double val;
    boolean tx;

    System.out.println("Qual o número da mesa");
    ms.mesa = scan.nextInt();
    
    System.out.println("Qual o número de pessoas");
    ms.pessoas = scan.nextInt();

    do{
        System.out.println("\nMENU");
        System.out.println("1. Pedir");
        System.out.println("2. Fechar");
        System.out.println("0. Sair");
        menu = scan.nextInt();

        switch(menu){
            case 1:
            System.out.println("Digite a descrição do produto ");
            scan.nextLine();
            desc = scan.nextLine();
         
        
            System.out.println("Digite o valor do produto ");
            val = scan.nextDouble();
            ms.pedir(desc,val);
            System.out.println("Produto registrado " + desc + " - R$"+ val);
            break;
            
    
            case 2:
            System.out.println("Você deseja pagar a taxa de serviço?");
            scan.nextLine();
            String taxa = scan.nextLine();


            if(taxa.equals("sim")){
                tx = true;
            }else{
                System.out.println("taxa não aplicada");
                tx = false;
            }


            nf = ms.fechar(tx);
            break;
        }
    }while(menu!=0);


    
    
    System.out.printf("O total final foi " + nf.totalFinal + "\n E o valor por pessoa ficou "+ nf.valorPorPessoa);
    }
}
