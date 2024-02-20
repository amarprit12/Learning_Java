package src.Test2;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a == b && a == c && b == c) {
            System.out.println("equilateral");
        } else if (a != b && a != c && b != c) {
            System.out.println("scalene");
        } else {
            System.out.println("isosceles");
        }
//        System.out. println(1 + 1 + 1 + 1 + 1 == 5);
    }
}
