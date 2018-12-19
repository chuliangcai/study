package jdk.proxy;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        MyInvocationHandler handler = new MyInvocationHandler(new HelloWorldImpl());
        HelloService proxy = (HelloService) Proxy.newProxyInstance(
                Test.class.getClassLoader(),
                new Class[]{HelloService.class},
                handler);
        proxy.sayHello();
        proxy.sayGoodbye();
    }
}
