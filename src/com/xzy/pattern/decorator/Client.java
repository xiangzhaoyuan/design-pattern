package com.xzy.pattern.decorator;

/**
 * 测试装饰模式
 * Created by Administratotr on 2017/12/27.
 */
public class Client {

    public static void main(String[] args) {
        Car car = new Car();
        car.move();

        System.out.println("增加功能...");
        FlyCar flyCar = new FlyCar(car);
        flyCar.move();

        System.out.println("增加功能...");
        WaterCar waterCar = new WaterCar(flyCar);
        waterCar.move();

        System.out.println("增加功能...");
        AICar aiCar = new AICar(waterCar);
        aiCar.move();

    }
}
