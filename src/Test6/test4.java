package src.Test6;

public class test4 {
    public static void main(String[] args) {
        String str = "Hello world";
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(5));
        System.out.println(str.charAt(8));


        // length
        System.out.println(str.length());
        String str1 = "abc";
        System.out.println(str1.length());
        System.out.println(str.indexOf('W'));
        System.out.println(str.indexOf('w'));
        System.out.println(str.indexOf("ll"));
        System.out.println(str.indexOf("abc"));
    }
}
