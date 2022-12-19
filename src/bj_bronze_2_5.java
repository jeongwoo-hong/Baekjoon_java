import java.util.Scanner;

public class bj_bronze_2_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int num1 = 0;
        int s = a % 10;
            num1 += s * 100;
            num1 += (a % 10) * 10;
            num1 += a % 10;
        System.out.print(num1);
    }
}
