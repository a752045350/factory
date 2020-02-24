package com.learn.factory;

public class FactoryTest {

    public static void main(String[] args) {
        PayFactory payFactory = new PayFactory();
        PayIns payIns = payFactory.payChange(WXPay.class);
        payIns.payTest();
    }

}
