import java.util.Scanner;
import java.util.Arrays;

public class bj_bronze_3_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print(arr[0]+" "+arr[n-1]);
    }
}