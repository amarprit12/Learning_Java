package src.Test8;

public class test4 {
    static void hello() {
        String s = "hello world";
        System.out.println(s);
    }

    public static void main(String[] args) {
        int a = 5;
        if (true) {
            a = 10;
            System.out.println("Inside if a = " + a);
        }
        System.out.println("Outside if a = " + a);
        hello();
//        System.out.println(s);
    }
}
