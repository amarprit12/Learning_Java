package src.Test3;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = (n * (n + 1)) / 2;
        System.out.println(sum);
    }
}