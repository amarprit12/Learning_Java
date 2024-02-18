package src.Test1;

public class test17 {
    public static void main(String[] args) {
        //eligible for voting
        int age = 15;
        String citizenship = "Indian";
        if (age >= 18 && citizenship == "Indian") {
            System.out.println("Person Can vote");
        } else {
            System.out.println("Person Cannot vote");

        }
    }
}
