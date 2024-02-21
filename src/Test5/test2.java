package src.Test5;

import java.util.Arrays;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // size of first array
        int m = scanner.nextInt(); // size of second array
        int a[] = new int[n];
        int b[] = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int j = 0; j < m; j++) {
            b[j] = scanner.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        printIntersection(a, b, n, m);
    }

    private static void printIntersection(int[] a, int[] b, int n, int m) {
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                i++;
            } else if (b[j] < a[i]) {
                j++;
            } else {
                System.out.print(a[i++] + " ");
                j++;
            }
        }
    }
}
