import java.util.Scanner;

public class bj_bronze_2_2 {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
            int max = 0;
            int num = 0;

            for (int i=1; i<arr.length; i++){
                if (arr[i-1] >= arr[i]){
                    max = arr[i-1];
                    num = i;
                }
                else {
                    max = arr[i];
                    num = i+1;
                }
        }
        System.out.println(max);
        System.out.print(num);
    }
}
