package src.Test9;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int x = scanner.nextInt();
        calculateBMI(y, x);
    }

    private static void calculateBMI(int y, int x) {
//        double BMI =  (x * 10000) / (y * y);

//        double BMI = round((x * 10000) / (y * y), 1);
        double BMI = Math.round((x * 10000) / (y * y));
        System.out.println("BMI: " + BMI);
        if (BMI > 29.9) {
            System.out.println("Obese");
        } else if (BMI >= 24.9 && BMI < 29.9) {
            System.out.println("Overweight");
        } else if (BMI >= 18.5 && BMI < 24.9) {
            System.out.println("Normal");
        } else {
            System.out.println("Underweight");
        }


    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);

        return (double) tmp / factor;
    }
}
