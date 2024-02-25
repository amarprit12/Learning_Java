package src.Test11;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int a[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
//        computeTranspose(a);
//        int[][] c = solve(a);
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                System.out.print(c[i][j] + " ");
//            }
//            System.out.println();
//        }
//        int[][] c1 = solve1(a);
//        for (int i = 0; i < cols; i++) {
//            for (int j = 0; j < rows; j++) {
//                System.out.print(c1[i][j] + " ");
//            }
//            System.out.println();
//        }

//        int[][] B = transpose(a);
//        transpose(a);
        int [][] B = transposeMatrix(a); // correct

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }

    }

//    private static void computeTranspose(int[][] a) {
//        for (int j = 0; j < a.length; j++) {
//            for (int i = 0; i < a[i].length; i++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }

//    public static int[][] solve(int[][] A) {
//        int rows = A.length;
//        int cols = A[0].length;
//        int[][] B = new int[rows][cols];
//        int i;
//        int j;
////        for (j = 0; j < A.length; j++) {
////            for (i = 0; i < A[0].length; i++) {
////                c[i][j] = A[i][j];
////            }
////        }
//        for (i = 0; i < rows; i++) {
//            for (j = 0; j < cols; j++) {
//                B[i][j] = A[j][i];
//            }
//        }
//        return B;
//    }

//    public static int[][] solve(int[][] A) {
//        int rows = A.length;
//        int cols = A[0].length;
//        int[][] B = new int[rows][cols];
//        int i;
//        int j;
//        for (i = 0; i < rows; i++) {
//            for (j = 0; j < cols; j++) {
//                B[i][j] = A[j][i];
//            }
//        }
//        return B;
//    }


    // correct code
    public static int[][] transposeMatrix(int[][] A) {
        int rows = A.length;
        int cols = 0;
        for (int i = 0; i < rows; i++) {
            cols = Math.max(cols, A[i].length);
        }

        int[][] B = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < A[i].length; j++) {
                B[j][i] = A[i][j];
            }
        }

        return B;
    }

//    public static int[][] solve1(int[][] A) {
//        int rows = A.length;
//        int cols = 0;
//        for (int i = 0; i < rows; i++) {
//            cols = Math.max(cols, A[i].length);
//        }
//        int[][] B = new int[cols][rows];
//        int i;
//        int j;
//        for (i = 0; i < rows; i++) {
//            for (j = 0; j < cols; j++) {
//                B[j][i] = A[i][j];
//            }
//        }
//        return B;
//    }

//    static void transpose(int A[][]) {
//        int rows = A.length;
//        int cols = 0;
//        for (int i = 0; i < rows; i++) {
//            cols = Math.max(cols, A[i].length);
//        }
//        System.out.println(cols);
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                System.out.print(A[i][j] + " ");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                int temp = A[i][j];
//                A[i][j] = A[j][i];
//                A[j][i] = temp;
//            }
//        }
//
////        return A;
//
//        for (int i = 0; i < A[i].length; i++) {
//            for (int j = 0; j < rows; j++) {
//                System.out.print(A[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
}
