import java.util.*;

public class Silver1 {
    int num(int a){
        int n = 0;
        while (a > 0){
            n += a % 10;
            a = a/10;
        }
        return a + n;
    }

    public static void main(String[] args){
        Silver1 sample = new Silver1();
        int c = 0;
        int k = 1;
        while (c <= 10){
            c = sample.num(k);
            k = c;
            System.out.println(c);
        }
    }
}
