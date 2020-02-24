package com.learn.factory;
import com.learn.factory.PayIns;

public class PayFactory {

    public PayIns payChange(Class<? extends  PayIns> clazz){
        try {
            if(clazz != null){
            return  clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return null;
    }
}
