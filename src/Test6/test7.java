package src.Test6;

public class test7 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = " World";
        String str3 = str1 + str2;
        System.out.println(str3);

        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + " " + s2;
        System.out.println(s3);

        int x = 5; // here 5 is typecasted to string
//        System.out.println(s1 + x);
        String s4 = s1 + x;
        System.out.println(s4);

        int[] arr = {5, 4, 2};
        System.out.println(arr + " "); // memory address where array is stored
    }
}
