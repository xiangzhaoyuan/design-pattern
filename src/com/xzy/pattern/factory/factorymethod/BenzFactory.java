package com.xzy.pattern.factory.factorymethod;

/**
 * Created by Administrator on 2017/12/21.
 */
public class BenzFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new Benz();
    }

}
