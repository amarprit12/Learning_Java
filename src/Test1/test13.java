package src.Test1;

public class test13 {
    public static void main(String[] args) {
//        String weather = "rainy";
//        if (weather == "rainy") {
//            System.out.println("Take an umbrella");
//        } else if (weather == "sunny") {
//            System.out.println("Wear sunglasses");
//        } else {
//            System.out.println("Check weather forecast");
//        }
        String weather = "rainy";
        switch (weather) {
            case "rainy":
                System.out.println("Take an umbrella");
                break;
            case "sunny":
                System.out.println("Wear sunglasses");
                break;
            default:
                System.out.println("Check weather forecast");
        }
    }
}
