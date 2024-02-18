package src.Test1;

import java.util.Scanner;

public class test15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().toLowerCase().charAt(0);
//        System.out.println(ch);
//        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//            System.out.println("Vowel");
//        } else {
//            System.out.println("Consonant");
//        }
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }

//        switch (ch) {
//           case 'a', 'e', 'i', 'o', 'u' :
//                System.out.println("Vowel");
//                break;
//            default:
//                System.out.println("Consonant");
//        }
    }
}
