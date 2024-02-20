package src.Test2;

public class test5 {
    public static void main(String[] args) {
        int[] a = {10, -3, 2, 12, 7};
        int n = 5;
        largest(a, n);
    }

    private static void largest(int[] a, int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        if (max == Integer.MIN_VALUE) {
            System.out.println("maximum doesn't exist");
        } else {
            System.out.println("max is: " + max);
        }
    }
}
