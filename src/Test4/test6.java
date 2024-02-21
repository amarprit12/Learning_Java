package src.Test4;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int result = checkArraySorted(a);
        if (result == 1) {
            System.out.println("sorted");
        } else {
            System.out.println("not sorted");
        }
    }

    //
//    private static int checkArraySorted(int[] A) {
//        int n = A.length;
//        int result = 0;
//        for (int i = 0; i < n; ) {
//            if (A[i] < A[i + 1]) {
//                i++;
//            } else {
//                result = 0;
//                break;
//            }
//            result = 1;
//        }
//        return result;
//
//    }
    private static int checkArraySorted(int[] A) {
        int result = 1;
        for (int i = 0; i < A.length-1; i++) {
            if (A[i + 1] < A[i]) {
                result = 0;
                break;
            } else {
                result = 1;
            }
        }
        System.out.println("Result: " + result);
        return result;
    }
}
