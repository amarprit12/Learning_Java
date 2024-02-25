package src.Test12;

import java.math.BigInteger;

public class test5 {
    public static void main(String[] args) {
//        long x = (long) Math.pow(10, 20);
//        System.out.println(x);

        BigInteger a = new BigInteger("500000000000000");
        BigInteger b = new BigInteger("100000000000000");
        System.out.println(a);
        System.out.println(b);

//        System.out.println(a + b);

        BigInteger c = a.add(b);
        System.out.println(c);

        BigInteger d = a.subtract(b);
        System.out.println(d);

        BigInteger e = a.multiply(b);
        System.out.println(e);

        BigInteger x = new BigInteger("123");
        BigInteger y = new BigInteger("2");

        System.out.println(x.multiply(y));
        System.out.println(x.divide(y));

        BigInteger z = x.pow(2);
        System.out.println(z);

        BigInteger x1 = new BigInteger("123456789123456");

        BigInteger z1 = x1.pow(20);
        System.out.println(z1);

        System.out.println(x.mod(y));
    }
}
