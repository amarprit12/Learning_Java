package src.Test1;

public class test5 {
    public static void main(String[] args) {
        int i = 20;
        long l = i;
        System.out.println("i: "+ i);
        System.out.println("l: "+ l);

        long x = 25;
        int y = (int) x;
        System.out.println(y);


        int x1 = 2000;
        byte b = (byte) x1;
        System.out.println(b); // lossy conversion
    }
}
