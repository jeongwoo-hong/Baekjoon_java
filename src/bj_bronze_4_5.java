import java.util.Scanner;

public class bj_bronze_4_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a >= b){
            int c = a - b;
            if (c < 0){
                System.out.print(-c);
            }
            else {
                System.out.print(a - b);
            }
        }
        else{
            int d = b - a;
            if (d < 0) {
                System.out.print(-d);
            }
            else {
                System.out.print(b - a);
            }
        }
    }
}
