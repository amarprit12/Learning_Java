package src.Test4;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
//        int[] a = new int[5];
        // input loop
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
//            System.out.println(a[i]);
        }
//        System.out.println(a[0]);
//        System.out.println(a[3]);
        System.out.println("output");
        // output loop
        for (int i = 0; i < a.length; i++) {
            System.out.println("At index: " + i + " value is " + a[i] + " ");
        }
    }
}
