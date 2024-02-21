package src.Test5;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printArray(n);
    }

    private static void printArray(int n) {
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = i * i;
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
