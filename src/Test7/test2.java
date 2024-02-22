package src.Test7;

public class test2 {
    public static void main(String[] args) {
        String str = "mpampamm";
//        String str =  "pampampam";
//        convertString(str);
        int result = solve(str);
        System.out.println(result);
    }

    private static void convertString(String str) {

        int countM = 0, countP = 0, countA = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                countA++;
            } else if (str.charAt(i) == 'm') {
                countM++;
            } else if (str.charAt(i) == 'p') {
                countP++;
            }
        }
//        System.out.println(countA);
//        System.out.println(countM);
//        System.out.println(countP);
//        int result = 0;
//        if ((countA + countM + countP) % 2 == 0) {
//            result = 1;
//        } else {
//            result = 0;
//        }
        int result = 0;
        while (countA > 0 && countM > 0) {
            if (countP > 0) {
                countP--;
                countM--;
            } else {
                countA--;
                countM--;
            }
        }
        if (countA == 0 && countM == 0) {
            result = 1;
        } else {
            result = 0;
        }
        System.out.println(result);
    }


    private static int solve(String str) {

        int countM = 0, countP = 0, countA = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                countA++;
            } else if (str.charAt(i) == 'm') {
                countM++;
            } else if (str.charAt(i) == 'p') {
                countP++;
            }
        }

        int result = 0;
        if ((countA + countM + countP) % 2 == 0) {
            result = 1;
        } else {
            result = 0;
        }
        return result;
    }

    public int solve1(String A) {
        int countM = 0, countP = 0, countA = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == 'a') {
                countA++;
            } else if (A.charAt(i) == 'm') {
                countM++;
            } else if (A.charAt(i) == 'p') {
                countP++;
            }
        }

        int result = 0;
        if ((countA + countM + countP) % 2 == 0) {
            result = 1;
        } else {
            result = 0;
        }
        return result;
    }
}
