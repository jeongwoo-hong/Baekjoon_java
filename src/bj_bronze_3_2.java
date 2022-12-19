import java.util.Scanner;

public class bj_bronze_3_2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = a + b;
            System.out.println(result);
        }
        sc.close();
    }
}
