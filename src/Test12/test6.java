package src.Test12;

import java.math.BigInteger;

public class test6 {
    public static void main(String[] args) {
//        int x = 50;
        long x = 50;
//        BigInteger b = new BigInteger("50");

        BigInteger b = new BigInteger(x + ""); // empty string

        System.out.println(x);
        System.out.println(b);


//        BigInteger b2 = new BigInteger("98765432189");
        BigInteger b2 = new BigInteger("9876");
        int y = b2.intValue();
        System.out.println(y);

        long z = b2.longValue();
        System.out.println(z);
    }
}
