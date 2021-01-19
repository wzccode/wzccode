package com;

public class Personiml implements Person{
    @Override
    public String sayHello(String name) {
        return "hello"+name;
    }

    @Override
    public String sayBye(String name) {
        return "bye"+name;
    }
}
