package src.Test13;

public class ComplexNumber {
    // instance variables
    int real;
    int imaginary;

    //     constructor
    ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
//
//    ComplexNumber(int r, int i) {
//        real = r;
//        imaginary = i;
//    }

    void print() {
        System.out.println("this = " + this);
        System.out.println(real + " + " + imaginary + "i");
    }

    ComplexNumber add(ComplexNumber y) {
        int sumReal = real + y.real;
        int sumImaginary = imaginary + y.imaginary;

        ComplexNumber z = new ComplexNumber(sumReal, sumImaginary);
        return z;
    }

    public static void main(String[] args) {
        ComplexNumber x = new ComplexNumber(2, 3);
//        complexNumber.real = 2;
//        complexNumber.imaginary = 3;
//        System.out.println(complexNumber.real);
//        System.out.println(complexNumber.imaginary);
        x.print();
        System.out.println("x = " + x);
        ComplexNumber y = new ComplexNumber(-5, 4);
//        y.real = -5;
//        y.imaginary = 4;
        y.print();

        ComplexNumber z = x.add(y);
        z.print();
    }

}
