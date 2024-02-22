package src.Test6;

public class test9 {
    public static void main(String[] args) {
//        String str = "Hello world";
        String str = "I love programming";
        String res = "";
        // traversing string in reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
            res += str.charAt(i);
        }
        System.out.println(res);
    }
}
