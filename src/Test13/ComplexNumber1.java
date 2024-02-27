package src.Test13;

public class ComplexNumber1 {
    // instance variables
    int real;
    int imaginary;

    //     constructor
    ComplexNumber1(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

//    void print() {
//        System.out.println(this.real + " + " + this.imaginary + "i");
//    }

    ComplexNumber1 add(ComplexNumber1 y) {
        int sumReal = this.real + y.real;
        int sumImaginary = this.imaginary + y.imaginary;
        ComplexNumber1 z = new ComplexNumber1(sumReal, sumImaginary);
        return z;
    }

    @Override
    public String toString() {
//        return "ComplexNumber1{" +
//                "real=" + real +
//                ", imaginary=" + imaginary +
//                '}';
//        return "This is a complex number";
        return this.real + " + " + this.imaginary + "i";
    }

    public static void main(String[] args) {
        ComplexNumber1 x = new ComplexNumber1(2, 3);
//        x.print();
//        System.out.println("x = " + x);
        ComplexNumber1 y = new ComplexNumber1(-5, 4);
//        y.print();

        ComplexNumber1 z = x.add(y);
//        z.print();

//        System.out.println("" + x.toString());
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }

}
