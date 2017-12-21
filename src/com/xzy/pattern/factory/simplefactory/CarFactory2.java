package com.xzy.pattern.factory.simplefactory;

/**
 * 简单工厂版本二
 * Created by Administrator on 2017/12/20.
 */
public class CarFactory2 {

    public static Car createAudi() {
            return new Audi();
    }

    public static Car createByd() {
        return new Byd();
    }
}
