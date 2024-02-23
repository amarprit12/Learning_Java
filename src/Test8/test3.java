package src.Test8;

public class test3 {
    public static void main(String[] args) {
//        int x = add(2, 3);
//        String s = add("Hello", "World");
//        System.out.println(x);
//        System.out.println(s);

        System.out.println(add(5, 4));
        System.out.println(add("Hello ", "World"));
        System.out.println(add(5, "Hello"));
    }

    // method overloading
    static int add(int a, int b) {
        System.out.println("Inside first add");
        return a + b;
    }

    static String add(String a, String b) {
        System.out.println("Inside second add");
        return a + b;
    }

//    static String add(int a, int b) {
//        System.out.println("Inside first add");
//        return a + "" + b;
//    }

    static String add(int a, String b) {
        System.out.println("Inside first add");
        return a + "" + b;
    }
}
