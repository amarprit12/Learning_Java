package src.Test13;

public class Car {
    String model = "HatchBack";
    String color = "Black";
    int price = 100000;
    boolean isLocked = false;

    Car(String modelName, String colorName, int priceValue) {
        System.out.println("Inside the constructor");
        model = modelName;
        color = colorName;
//        price = priceValue;
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
//        Car car1 = new Car();
//        Car car2 = new Car();
//        Car car1 = new Car("Hatchback", "Red");
//        Car car2 = new Car("Sedan", "Silver");
        Car car1 = new Car("Hatchback", "Red", 2000);
        Car car2 = new Car("Sedan", "Silver", 5000);
        System.out.println(car1.color);
        System.out.println(car1.model);
//        System.out.println(car1.price);

        // Reading the properties
        System.out.println(car1.getPrice());
        System.out.println(car2.getPrice());
        System.out.println(car2.model);

//        car2.color = "Grey";
        System.out.println(car2.color);

        car1.drive();
        car2.drive();
        car1.lock();
        car2.unlocked();
        System.out.println(car1.isLocked);
        System.out.println(car2.isLocked);

        car2.setPrice(-5000);
        System.out.println(car2.getPrice());
    }

}
