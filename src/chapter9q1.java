public class chapter9q1 {
    public static void main(String[] args){
        String s = "a:b:c:d";
        String[] sp = s.split(":");
        String result = String.join("#", sp);
        System.out.println(result);

    }
}
