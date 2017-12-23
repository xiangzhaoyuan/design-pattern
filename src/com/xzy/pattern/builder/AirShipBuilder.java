package com.xzy.pattern.builder;

/**
 * 为创建一个产品对象的各个部件指定抽象接口
 * 创建对象的过程可以结合工厂模式使用
 * Created by Administrator on 2017/12/22.
 */
public interface AirShipBuilder {

    Engine buildEngine();

    OrbitalModule buildOrbitalModule();

    EscapeTower buildEscapeTower();
}
