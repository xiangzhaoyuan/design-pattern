package com.xzy.pattern.factory.abstractfactory;

/**
 * Created by Administrator on 2017/12/21.
 */
public interface CarFactory {

    Engine createEngine();

    Seat createSeat();

    Tyre createTyre();

}
