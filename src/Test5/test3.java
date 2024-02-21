package src.Test5;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        findMaxAndMin(a);
    }

    private static void findMaxAndMin(int[] a) {
        int n = a.length;
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            maxValue = Math.max(maxValue, a[i]);
        }

        for (int i = 0; i < n; i++) {
            minValue = Math.min(minValue, a[i]);
        }
        System.out.println("Max: " + maxValue);
        System.out.println("Min: " + minValue);
    }
}
