package src.Test4;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
//        differenceEvenOdd(a, n);
        int res = even_odd(a);
        System.out.println(res);
    }

    public static int even_odd(int[] A) {
        int n = A.length;
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] % 2 == 0) {
                sumEven += A[i];
            } else if (A[i] % 2 == 1) {
                sumOdd += A[i];
            }

        }
        int difference = sumEven - sumOdd;
        return difference;
    }

    private static void differenceEvenOdd(int[] a, int n) {
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                sumEven += a[i];
            } else if (a[i] % 2 == 1) {
                sumOdd += a[i];
            }

        }
        int difference = sumEven - sumOdd;
        System.out.println(difference);
    }
}
