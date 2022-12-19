import java.util.Scanner;

public class bj_bronze_3_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuffer a = new StringBuffer();
        for (int i=0; i<n; i++){
            a.append("*");
            System.out.println(a);
        }
    }
}
