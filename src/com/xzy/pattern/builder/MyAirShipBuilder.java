package com.xzy.pattern.builder;

/**
 * 实现Builder的接口以构造和装配该产品的各个部件，定义并明确它所创建的表示。
 * Created by Administrator on 2017/12/22.
 */
public class MyAirShipBuilder implements AirShipBuilder {
    @Override
    public Engine buildEngine() {
        System.out.println("构建向召元牌发动机");
        return new Engine("向召元牌发动机");
    }

    @Override
    public OrbitalModule buildOrbitalModule() {
        System.out.println("构建向召元牌轨道舱");
        return new OrbitalModule("向召元牌轨道舱");
    }

    @Override
    public EscapeTower buildEscapeTower() {
        System.out.println("构建向召元牌逃逸塔");
        return new EscapeTower("向召元牌逃逸塔");
    }
}
