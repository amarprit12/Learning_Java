package src.Test14;

public class ComplexNumber {

    float real, imaginary;

    // Define constructor here
    ComplexNumber(float real, float imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    ComplexNumber add(ComplexNumber x) {
        // Complete the function
        float realAdd = this.real + x.real;
        float imagAdd = this.imaginary + x.imaginary;
        ComplexNumber z = new ComplexNumber(realAdd, imagAdd);
        return z;
    }

    ComplexNumber subtract(ComplexNumber x) {
        float realSub = this.real - x.real;
        float imagSub = this.imaginary - x.imaginary;
        ComplexNumber z = new ComplexNumber(realSub, imagSub);
        return z;

    }

    ComplexNumber multiply(ComplexNumber x) {
        float realMult = this.real * x.real;
        float imagMult = this.imaginary * x.imaginary;
        ComplexNumber z = new ComplexNumber(realMult, imagMult);
        return z;

    }

    ComplexNumber divide(ComplexNumber x) {
        float realDiv = this.real / x.real;
        float imagDiv = this.imaginary / x.imaginary;
        ComplexNumber z = new ComplexNumber(realDiv, imagDiv);
        return z;
    }
    @Override
    public String toString() {
        return this.real + " + " + this.imaginary + "i";
    }
}