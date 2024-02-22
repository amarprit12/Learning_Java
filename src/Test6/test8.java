package src.Test6;

import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        reverseString(str, str.length());
    }

    private static void reverseString(String str, int n) {
        char[] ch = str.toCharArray();
        int start = 0;
        int end = n - 1;
        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        System.out.println(String.valueOf(ch));
    }
}
