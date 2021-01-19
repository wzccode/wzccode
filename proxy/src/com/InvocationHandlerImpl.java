package com;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class InvocationHandlerImpl implements InvocationHandler {

    private Object target;

    public InvocationHandlerImpl(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("调用前");

        Object invoke = method.invoke(target, args);
        System.out.println("method:"+method);
        System.out.println("调用之后");
        System.out.println("yes");
        return invoke;
    }
}
