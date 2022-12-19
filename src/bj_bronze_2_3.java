import java.util.Scanner;

public class bj_bronze_2_3 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int point = 0;
        for (int i=0; i<n; i++){
            String arr = sc.nextLine();
            for (int j=0; j<arr.length(); j++){
                String a = arr.substring(j,j+1);
                if (a.equals("O")){
                    count ++;
                }
                else{
                    count = 0;
                }
                point += count;
            }
            System.out.println(point);
        }
    }
}
