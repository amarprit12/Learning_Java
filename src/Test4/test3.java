package src.Test4;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        // input loop
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        int index = findIndexUsingLinearSearch(a, n, key);
        System.out.println(index);
    }

    private static int findIndexUsingLinearSearch(int[] a, int n, int key) {
        int index = -1;
//        for (int i = 0; i < n; i++) {
//            if (a[i] == key) {
//                index = i;
//                break;
//            }
//        }
        // Iterates R to L and returns last occurrence
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] == key) {
                index = i;
                break;
            }
        }
        return index;
    }
}
