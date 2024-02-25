package src.Test12;

import java.math.BigInteger;

public class test9 {
    public static void main(String[] args) {
//        int x = 5;
        int x = 500;
//        int res = 1;
        BigInteger res = new BigInteger("1");
        for (int i = 1; i <= x; i++) {
//            res = res * i;
            BigInteger temp = new BigInteger(i + "");
//            res = res.multiply(i);
            res = res.multiply(temp);
        }
        System.out.println(res);
    }
}
