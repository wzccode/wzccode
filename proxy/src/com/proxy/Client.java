package com.proxy;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Client {

    @Test
    public void test(){
        Person person = new PersonImpl();
        Person proxyPerson = (Person) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Object rtnValue = null;
                        Float money = (Float) args[0];
                        if ("sale".equals(method.getName())){
                            rtnValue = method.invoke(person, money*0.8f);
                            return rtnValue;
                        }
                        return rtnValue;
                    }
                });
        proxyPerson.sale(10000f);
    }
}
