package jvm.objectHeader;

import java.io.IOException;

public class Test {
    private int a;
    private long b;

    public Test(int a, long b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) throws IOException {
        Test a = new Test(1,9L);
        System.in.read();
    }
}
