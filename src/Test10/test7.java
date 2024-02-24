package src.Test10;

import java.util.Scanner;

public class test7 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        // first matrix
        int[][] a = new int[rows][cols];
        // second matrix
        int[][] b = new int[rows][cols];

        int[][] c = new int[rows][cols];

//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                a[i][j] = scanner.nextInt();
//            }
//        }
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                b[i][j] = scanner.nextInt();
//            }
//        }
        readMatrix(a);
        readMatrix(b);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void readMatrix(int a[][]) {
        // int rows = a.length
        // int cols = a[0].length
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
    }
}
