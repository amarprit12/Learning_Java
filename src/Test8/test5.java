package src.Test8;

public class test5 {
    public static void main(String[] args) {
        float avg1 = getAvg(2, 5, 6, 1, 8, 9);
        float avg2 = getAvg(2, 8, 1);

        System.out.println(avg1);
        System.out.println(avg2);
    }

    private static float getAvg(float... varargs) {
//        System.out.println(varargs);
//        System.out.println(varargs.getClass().getSimpleName());
//        return varargs;

        float total = 0;
        for (float x : varargs) {
            total += x;
        }
        return (total / varargs.length);
    }
}
