package src.Test12;

import java.math.BigInteger;

public class test8 {
    public static void main(String[] args) {
        int x = 500;
        int res = 1;
        BigInteger b = new BigInteger(x + "");

        for (int i = 1; i <= x; i++) {
//            res = res * i;
            b = b.multiply(BigInteger.valueOf(i));
        }
        System.out.println(b);
//        System.out.println(res);
    }
}
