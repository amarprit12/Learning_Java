package src.Test12;

import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = computeFactorial(n);
        System.out.println(res);
    }

    private static int computeFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * computeFactorial(n - 1);
    }
}
