import java.util.Scanner;

public class bj_bronze_4_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if ((a % 4 == 0) && (a % 100 != 0)){
            System.out.print(1);
        }
        else if (a % 400 == 0){
            System.out.print(1);
        }
        else {
            System.out.print(0);
        }
    }
}
