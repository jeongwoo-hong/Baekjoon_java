import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class chapter3q6 {
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
        a.sort(Comparator.reverseOrder());
        System.out.println(a);
    }
}
