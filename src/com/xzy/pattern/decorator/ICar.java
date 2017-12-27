package com.xzy.pattern.decorator;

/**
 * Created by Administrator on 2017/12/27.
 */

//抽象组件
public interface ICar {
    void move();
}

//具体构建对象
class Car implements ICar {

    @Override
    public void move() {
        System.out.println("在陆地上跑!");
    }
}

//Decorator装饰对象
class SuperCar implements ICar {

    private ICar car;

    public SuperCar(ICar car) {
        super();
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}

//ConcreteDecorator具体装饰对象
class FlyCar extends SuperCar {

    public FlyCar(ICar car) {
        super(car);
    }

    public void fly() {
        System.out.println("天上飞!");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}

//ConcreteDecorator具体装饰对象
class WaterCar extends SuperCar {

    public WaterCar(ICar car) {
        super(car);
    }

    public void swim() {
        System.out.println("水上游!");
    }

    @Override
    public void move() {
        super.move();
        swim();
    }
}

//ConcreteDecorator具体装饰对象
class AICar extends SuperCar {

    public AICar(ICar car) {
        super(car);
    }

    public void autoMove() {
        System.out.println("自动驾驶!");
    }

    @Override
    public void move() {
        super.move();
        autoMove();
    }
}