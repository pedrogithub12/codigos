package RetornarFatorial;

public class RetornoFatorial {
    public static void main(String[] args) {
        int f = fatorial(4,1);
        System.out.println(f);
    }
    public static int fatorial(int fat, int num){
        if (num > 1)
            return fatorial(num -1, fat * num);
        else
            return fat;
        
    }
}
