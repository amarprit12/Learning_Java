package src.Test;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//        System.out.println("n: "+ n);
        int m = scanner.nextInt();
        int left = n - m;
//        System.out.println("left: " + left);
        System.out.print(left);
    }
}
