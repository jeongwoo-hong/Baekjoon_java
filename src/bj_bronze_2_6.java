import java.util.Scanner;

public class bj_bronze_2_6 {
    public static int fib(int n){
        if(n == 0) {
            return 0;
        }
        else if(n == 1) {
            return 1;
        }
        else {
            return fib(n-2)+fib(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        for (i = 0; i < n; i++){
        }
        System.out.print(fib(i)+" ");
    }
}
