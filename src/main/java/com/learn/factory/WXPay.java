package com.learn.factory;

public class WXPay implements PayIns{

    @Override
    public void payTest() {
        System.out.println("使用微信支付");
    }
}
