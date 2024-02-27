package src.Test13;

public class Car1 {
    String model;
    String color;
    int price;
    boolean isLocked = false;

    Car1() {
        System.out.println("In the default constructor");
        model = "HatchBack";
        color = "Black";
        price = 100000;
    }

    Car1(String modelName, String colorName, int priceValue) {
        System.out.println("In the parameterised constructor");
        model = modelName;
        color = colorName;
        setPrice(priceValue);
    }

    void drive() {
        System.out.println("zoom zoom zoom");
    }

    void lock() {
        isLocked = true;
        System.out.println("Car is now locked");
    }

    void unlocked() {
        isLocked = false;
        System.out.println("car is now unlocked");
    }

    // Getter for price property
    float getPrice() {
        return price;
    }

    // Setter for price property
    void setPrice(int priceValue) {
        if (priceValue < 0) {
            priceValue = 0;
        }
        price = priceValue;
    }

    public static void main(String[] args) {
        Car1 car1 = new Car1("Hatchback", "Red", 2000);
        Car1 car2 = new Car1();

        System.out.println(car1.model);
        System.out.println(car1.color);
        System.out.println(car1.price);

        System.out.println(car2.model);
        System.out.println(car2.color);
        System.out.println(car2.price);


    }

}

