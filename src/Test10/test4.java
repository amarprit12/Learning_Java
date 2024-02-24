package src.Test10;

public class test4 {
    public static void main(String[] args) {
        int[][] a = {
                {2, 5, 1, 7},
                {8, -2, 0, 5},
                {-9, -1, 3, 2},

        };
//        System.out.println(a[0][0]);
//        System.out.println(a[0][1]);
//        System.out.println(a[0][2]);
//        System.out.println(a[0][3]);
//        System.out.println(a[1][0]);
//        System.out.println(a[1][1]);
//        System.out.println(a[1][2]);
//        System.out.println(a[1][3]);
//        System.out.println(a[2][0]);
//        System.out.println(a[2][1]);
//        System.out.println(a[2][2]);
//        System.out.println(a[2][3]);


//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }


//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
    }
}
