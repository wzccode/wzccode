package com;

import org.junit.Test;

import java.lang.reflect.Method;

public class Main1 {

    @Test
    public void test() throws Exception {
        Personiml personiml = new Personiml();
        Class personimlClass = personiml.getClass();
        Method method = personimlClass.getMethod("sayHello", String.class);
        Object invoke = method.invoke(personiml,"wang");
        System.out.println(invoke);
    }
}
