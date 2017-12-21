package com.xzy.pattern.factory.simplefactory;

/**
 * 测试使用简单工厂模式：解耦合，但是增加car种类的时候需要修改CarFactory，违反开闭原则
 * Created by Administrator on 2017/12/20.
 */
public class Client2 {

    public static void main(String[] args) {
        //Car car1 = CarFactory1.createCar("Audi");
        //Car car2 = CarFactory1.createCar("Byd");

        Car car1 = CarFactory2.createAudi();
        Car car2 = CarFactory2.createByd();

        car1.run();
        car2.run();
    }

}
