package src.Test1;

import java.util.Scanner;

public class test12 {

    private static boolean checkEvenOdd(int x) {
        boolean result = false;
        if (x % 2 == 0) {
            result = true;
        } else if (x % 2 == 1) {
            result = false;
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
//        boolean result = checkEvenOdd(x);
//        if (result) {
//            System.out.println("Even num");
//        } else {
//            System.out.println("Odd num");
//        }
        if (x % 2 == 0) {
            System.out.println("Even num");
        } else {
            System.out.println("Odd num");
        }
    }
}
