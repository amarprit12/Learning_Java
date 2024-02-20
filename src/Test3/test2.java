package src.Test3;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = calculateLcm(a, b);
        System.out.println(result);


    }

    private static int calculateLcm(int a, int b) {
        return (a * b) / calculatehcf(a, b);

    }

    private static int calculatehcf(int a, int b) {
        if (a == 0) {
            return b;
        }
        return calculatehcf(b % a, a);

    }

}
