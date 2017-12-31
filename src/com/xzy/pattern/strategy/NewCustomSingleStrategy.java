package com.xzy.pattern.strategy;

/**
 * Created by Administrator on 2017/12/31.
 */
public class NewCustomSingleStrategy implements Strategy {
    @Override
    public double getPrice(double standPrice) {
        System.out.println("不打折，原价");
        return standPrice;
    }
}
