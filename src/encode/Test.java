package encode;

public class Test {
    public static void main(String[] args) {
        String a="网易";
        byte[] arr = a.getBytes();
        for(byte b:arr){
            System.out.println(Integer.toHexString(b));
        }
    }
}
