import java.util.Scanner;

public class chapter9q5 {
    public static void main(String[] args){
        System.out.print("구구단을 출력할 숫자를 입력하세요(2~9) : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i < 10 ; i ++ ){
            int r = n * i;
            System.out.print(r + " ");
        }

    }
}
