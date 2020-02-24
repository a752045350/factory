package com.learn.factory;

public class AliPay implements PayIns {

    @Override
    public void payTest() {
        System.out.println("支付宝支付");
    }
}
