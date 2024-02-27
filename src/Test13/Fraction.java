package src.Test13;

public class Fraction {
    int numerator, denominator;

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    Fraction add(Fraction a) {
        int totalNum = this.numerator + a.numerator;
        int totalDenom = this.denominator + a.denominator;
        Fraction z = new Fraction(totalNum, totalDenom);
        return z;

    }

    Fraction subtract(Fraction a) {
        int SubNum = this.numerator * a.denominator - this.denominator * a.numerator;
        int SubDenom = this.denominator * a.denominator;
        Fraction z = new Fraction(SubNum, SubDenom);
        return z;

    }

    Fraction multiply(Fraction a) {
        int multNum = this.numerator * a.numerator;
        int multDenom = this.denominator * a.denominator;
        Fraction z = new Fraction(multNum, multDenom);
        return z;

    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

    public static void main(String[] args) {
        Fraction x = new Fraction(2, 3);
        Fraction y = new Fraction(4, 5);
        Fraction z = x.add(y);
        System.out.println(z);

        Fraction z1 = x.subtract(y);
        System.out.println(z1);

        Fraction z2 = x.multiply(y);
        System.out.println(z2);
    }

}
