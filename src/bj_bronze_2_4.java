import java.util.Scanner;

public class bj_bronze_2_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int mul = a*b*c;
        String num = "" + mul;
        for (int i=0; i<10; i++){
            int count = 0;
            for (int j=0; j<num.length(); j++){
                if ((num.charAt(j)-'0')==i){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
