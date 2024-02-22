package src.Test6;

import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        boolean result = checkPalindrome(str);
        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean checkPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
