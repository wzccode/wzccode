package com.proxy;

public class PersonImpl implements Person{
    @Override
    public void sale(float money) {
        System.out.println("销售产品"+money);
    }

    @Override
    public void afterService(float money) {
        System.out.println("提供售后"+money);

    }
}
