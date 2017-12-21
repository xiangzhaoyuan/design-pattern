package com.xzy.pattern.factory.factorymethod;

/**
 * 解决了简单工厂模式不符合开闭原则的问题，但是类的数量增多、管理难度增加
 * Created by Administrator on 2017/12/21.
 */
public class Client {

    public static void main(String[] args) {

        Car car1 = new AudiFactory().createCar();
        Car car2 = new BydFactory().createCar();

        car1.run();
        car2.run();

        Car car3 = new BenzFactory().createCar();
        car3.run();

    }

}
