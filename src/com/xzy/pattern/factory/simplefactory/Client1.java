package com.xzy.pattern.factory.simplefactory;

/**
 * 测试不用工厂模式：clien需要和多个类打交道，违反迪米特法则
 * Created by Administrator on 2017/12/20.
 */
public class Client1 {

    public static void main(String[] args) {
        Car car1 = new Audi();
        Car car2 = new Byd();

        car1.run();
        car2.run();
    }

}
