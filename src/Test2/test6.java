package src.Test2;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int maxValue = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int current = scanner.nextInt();
//            if (current > max) {
//                max = current;
//            }
            maxValue = Math.max(maxValue, current);
        }

        System.out.println("max is : " + maxValue);
    }
}
