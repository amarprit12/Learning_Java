package src.Test6;

public class test13 {
    public static void main(String[] args) {
        String str = "hello";
        char[] ch = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(str);
        System.out.println(ch);

        // string to charArray
        char[] ch2 = str.toCharArray();
        System.out.println(ch2);

        // charArray to string
        String str2 = new String(ch);
        System.out.println(str2);
    }
}
