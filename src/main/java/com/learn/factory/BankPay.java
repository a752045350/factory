package com.learn.factory;

public class BankPay implements PayIns {

    @Override
    public void payTest() {
        System.out.println("银联支付");
    }
}
