package src.Test1;

import java.util.Scanner;

public class test16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        String output;
//        if (x % 2 == 0) {
//            output = "Even";
//        } else {
//            output = "Odd";
//        }

        output = (x % 2 == 0) ? "Even" : "Odd";
        System.out.println(output);
    }
}
