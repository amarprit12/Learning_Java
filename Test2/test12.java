package Test2;

public class test12 {
    public static void main(String[] args) {
        generateRandomNos();
    }

    private static void generateRandomNos() {
        while (true) {
            int num = (int) (Math.random() * 10 + 1);
            if (num == 5) {
                break;
            }
            if (num % 4 == 0) {
                System.out.println("multiple of 4");
                continue;
            }
            System.out.println(num + " ");
        }
    }

}
