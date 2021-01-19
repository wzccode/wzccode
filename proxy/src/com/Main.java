package com;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        Person personiml = new Personiml();
        InvocationHandlerImpl handler = new InvocationHandlerImpl(personiml);

        ClassLoader loader = personiml.getClass().getClassLoader();
        Class[] interfaces = personiml.getClass().getInterfaces();

        Person person = (Person) Proxy.newProxyInstance(loader,interfaces,handler);

        System.out.println("动态代理对象的类型"+person.getClass().getName());

        String s = person.sayHello("wang");
        System.out.println(s);
        
    }
}
