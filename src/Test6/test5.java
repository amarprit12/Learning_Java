package src.Test6;

public class test5 {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(s.indexOf('l'));

        // equals
        String str = "Hello World";
        String str2 = new String("Hello World");
        System.out.println(str.equals(str2)); // compares content of string
        System.out.println(str == str2); // compares object references

        // contains
        System.out.println(str.contains("ll"));
        System.out.println(str.contains("Hello"));
        System.out.println(str.contains("Hello1"));

        String s2 = s.toLowerCase();
        System.out.println("s2: " + s2);
        System.out.println("s: " + s);

        String s3 = s.toUpperCase();
        System.out.println("s3: " + s3);
        System.out.println("s: " + s);

        // replace

        String s4 = "I love programming";
        String s5 = "Java";
        String s6 = s4.replace("programming", s5);
        System.out.println("Replacement: " + s6);
        System.out.println("s4: " + s4);
        System.out.println("s5: " + s5);


        String s7 = "I love Programming. Programming is awesome";
        String s8 = "Java";
        String s9 = s7.replace("Programming", s8);
        System.out.println("Replacement: " + s9);
        System.out.println("s7: " + s7);
        System.out.println("s8: " + s8);
    }
}
