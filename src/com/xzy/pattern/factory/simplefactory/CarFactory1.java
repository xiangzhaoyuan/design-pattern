package com.xzy.pattern.factory.simplefactory;

/**
 * 简单工厂版本一
 * Created by Administrator on 2017/12/20.
 */
public class CarFactory1 {

    public static Car createCar(String type) {
        if ("Audi".equals(type)) {
            return new Audi();
        } else if ("Byd".equals(type)) {
            return new Byd();
        }
        return null;
    }
}
