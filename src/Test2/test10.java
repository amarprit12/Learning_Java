package src.Test2;

import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int sum = 0;
//        int i = 0;
//        while (i >= 0) {
//            num = scanner.nextInt();
//            sum = sum + num;
//            i++;
//            if (num < 0) {
//                break;
//            }
//        }
//        System.out.println(sum);
        do {
            num = scanner.nextInt();
            sum += num;
        } while (num >= 0);
        System.out.println(sum);
    }

}
