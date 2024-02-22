package src.Test6;

public class test10 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("I like programming");
        System.out.println(stringBuilder);
        stringBuilder.append(" and coffee");
        System.out.println(stringBuilder);

        stringBuilder.insert(18, ", gaming");
        System.out.println(stringBuilder);

        stringBuilder.replace(2,6, "love");
        System.out.println(stringBuilder);

        stringBuilder.delete(7,20);
        System.out.println(stringBuilder);

        String str = stringBuilder.toString();
        System.out.println(str);


    }
}
