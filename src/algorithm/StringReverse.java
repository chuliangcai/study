package algorithm;

public class StringReverse {

    public static void main(String[] args) {
        System.out.println(reverseString("12345"));
    }

    private static String reverseString(String s) {
        if (s.isEmpty()) {
            return s;
        }
        return reverseString(s.substring(1)) + s.charAt(0);
    }
}
