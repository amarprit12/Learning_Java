package src.Test8;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int result = printSquare(n);
//        System.out.println(result);
        System.out.println(printSquare(10));
        System.out.println(printSquare(7));
        hello();
        String[] res = heroes();
        for (String s : res) {
            System.out.println(s);
        }
    }

    private static int printSquare(int n) {
        return n * n;
    }

    private static void hello() {
        System.out.println("hello world");
    }

    // array of String
    private static String[] heroes() {
        String[] superHeroes = {"Iron Man", "SpiderMan", "Captain America"};
        return superHeroes;
    }
}
