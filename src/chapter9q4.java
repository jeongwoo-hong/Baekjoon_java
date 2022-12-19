import java.util.Scanner;

public class chapter9q4 {
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
        for (int i = 0; fib(i) <= n; i++){
            System.out.print(fib(i)+" ");
        }
    }
}
