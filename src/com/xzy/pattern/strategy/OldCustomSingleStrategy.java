package com.xzy.pattern.strategy;

/**
 * Created by Administrator on 2017/12/31.
 */
public class OldCustomSingleStrategy implements Strategy {
    @Override
    public double getPrice(double standPrice) {
        System.out.println("打八五折");
        return standPrice * 0.85;
    }
}
