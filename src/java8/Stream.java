package java8;

import java.util.ArrayList;
import java.util.List;

public class Stream {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("111");
        strings.add("222");
        strings.add("333");
        strings.forEach(t -> {
            if (t.startsWith("2")) {
                return;
            }
            System.out.println(t);
        });
    }
}
