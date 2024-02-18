package src.Test1;

import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x > 0) {
            System.out.println("Positive Num");
        } else if (x < 0) {
            System.out.println("Negative Num");
        } else {
            System.out.println("Num is 0");
        }
    }
}
