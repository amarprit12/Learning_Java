package src.Test9;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        int A;
        int B;
        int C;
        Scanner scanner = new Scanner(System.in);
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        int days = printMinimumDays(A, B, C);
        System.out.println(days);
    }

    private static int printMinimumDays(int A, int B, int C) {
        int days = 0;
        if (A <= B) {
            return -1;
        }
        int decreaseRate = A - B;
        days = C / decreaseRate;
        if (C % decreaseRate != 0) {
            days += 1;
        }
        return days;
    }
}
