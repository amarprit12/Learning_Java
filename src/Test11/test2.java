package src.Test11;

public class test2 {
    public static void main(String[] args) {
        int x = 5;
        float y = 3.14F;
        long z = 6000;
        //Autoboxing

        Integer intObj = x;
        Float floatObj = y;
        Long longObj = z;

        System.out.println(intObj);
        System.out.println(floatObj);
        System.out.println(longObj);
        System.out.println(intObj.intValue());

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.max(5, 3));

        Integer n =10;
        int nn = 10;
        System.out.println(n);
        System.out.println(nn);

    }
}
