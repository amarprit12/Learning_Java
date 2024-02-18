package src.Test1;

import java.util.Scanner;

public class test8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int r = scanner.nextInt();
        int t = scanner.nextInt();

        int SI = (p * r * t) / 100;
//        System.out.println("SI: " + SI);
        System.out.println(SI);

    }
}
