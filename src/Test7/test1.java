package src.Test7;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char first = str.charAt(0);
//         String str2 = String.valueOf(first);
//        replacefirst(str, str2);
//        replacefirst(str, first);
        String output = change_char(str);
        System.out.println(output);
    }

    //    private static void replacefirst(String str, String str2) {
////        StringBuilder sb = new StringBuilder(str);
////        StringBuilder sb1 = sb.replaceAll(2, str.length(), str2);
////        System.out.println(str.length());
////        System.out.println(str2.length());
////        String replaced = sb1.toString();
////        System.out.println(replaced);
////          String replaced = "";
////          replaced = str.replace(first, '$');
////
////         System.out.println(replaced);
//    }
    private static String replacefirst(String str, char first) {
        String replaced = "";
        String output = "";
        replaced = str.replace(first, '$');
        System.out.println(replaced.charAt(0));
        if (replaced.charAt(0) == '$') {
            StringBuilder sb = new StringBuilder(replaced);
            sb.replace(0, 1, String.valueOf(first));
            output = sb.toString();
            System.out.println("output: " + output);
        }
//        System.out.println(replaced);
//        System.out.println(output);
        return output;
    }

    public static String change_char(String s) {
        // complete the function template
        char first = s.charAt(0);
        String replaced = "";
        String output = "";
        replaced = s.replace(first, '$');
        if (replaced.charAt(0) == '$') {
            StringBuilder sb = new StringBuilder(replaced);
            sb.replace(0, 1, String.valueOf(first));
            output = sb.toString();

        }
        return output;
    }
}
