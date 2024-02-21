package src.Test4;

public class test9 {
    public static void main(String[] args) {

    }
    static boolean check(int[]arr) {
        int n = arr.length;
        for(int i=0; i < n-1;i++) {
            if(arr[i+1] <= arr[i]) {
                return false;
            }
        }
        return true;

    }
}
