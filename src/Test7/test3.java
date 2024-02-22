package src.Test7;

public class test3 {
    public static void main(String[] args) {
        String s = "restart";

        changeOccurrences(s);
    }

    private static void changeOccurrences(String s) {
        String output = "";
        if (s == null || s.isEmpty()) {
            return;
        }
        char firstChar = s.charAt(0);
        StringBuilder sb = new StringBuilder();
        sb.append(firstChar);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == firstChar) {
                sb.append('$');
            } else {
                sb.append(s.charAt(i));
            }
        }
        output = sb.toString();
        System.out.println(output);
    }
}
