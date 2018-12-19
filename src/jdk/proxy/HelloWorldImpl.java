package jdk.proxy;

public class HelloWorldImpl implements HelloService{
    @Override
    public void sayHello() {
        System.out.print("hello world");
    }

    @Override
    public void sayGoodbye() {
        System.out.println("goodbye");
    }
}
