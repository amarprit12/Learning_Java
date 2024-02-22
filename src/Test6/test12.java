package src.Test6;

import java.util.Scanner;

public class test12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        // generate reverse
        // use StringBuilder

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String reverse = sb.toString();

        // compare str and reverse

        if (str.equals(reverse)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
