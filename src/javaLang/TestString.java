package javaLang;

public class TestString {
    public static void main(String[] args) {
        String a = "网易";
        System.out.println(a.length());
        System.out.println(a.codePoints().count());
        a.codePoints().forEach(t->{
            System.out.println(Integer.toHexString(t));
        });
    }
}
