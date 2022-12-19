import java.util.ArrayList;
import java.util.Arrays;

public class chapter3q7 {
    public static void main(String[] args){
        ArrayList<String> a = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        String result = String.join(" ", a);
        System.out.println(result);
    }
}
