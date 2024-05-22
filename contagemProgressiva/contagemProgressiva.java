package contagemProgressiva;

import java.util.Scanner;

public class contagemProgressiva {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        
        int ult =100;
        contagemProgressiva(0, ult);
    }
    public static void contagemProgressiva(int começo, int fim){
        if (começo == fim ) {
            System.out.println(começo);
            System.out.println("--fim--");
            
        }else{
            System.out.println(começo);
            contagemProgressiva(começo +1, fim);
        }

    }
}