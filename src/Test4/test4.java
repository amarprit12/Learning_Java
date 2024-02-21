package src.Test4;

public class test4 {
    public static void main(String[] args) {
        int[] a = {5, 3, 2, 4, 1};

//        for (int num : a) {
//            System.out.println(num);
//        }
//        for (int num : a) {
//            System.out.println(num*num);
//        }

        int key = 20;
        boolean found = false;
        for (int num : a) {
            if (num == key) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Number found");
        } else {
            System.out.println("Number not found");
        }
    }
}
