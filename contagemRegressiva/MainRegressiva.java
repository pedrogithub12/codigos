package contagemRegressiva;

public class MainRegressiva {
    public static void main(String[] args) {
        contagemRegressiva(100);
    }
    public static void contagemRegressiva(int fim){
        if (fim == 0) {
            System.out.println(fim);
            System.out.println("--fim--");
        }else{
            System.out.println(fim);
            contagemRegressiva(fim -1);
        }
    }

}
