package Test2;

import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int countDigits = 0;

        while (num > 0) {
            num = num / 10;
            countDigits++;
        }
        System.out.println("No of digits: " + countDigits);
    }
}
