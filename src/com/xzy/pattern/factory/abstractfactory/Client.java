package com.xzy.pattern.factory.abstractfactory;

/**
 * 适用于生产产品族的情况，对增加产品无能为力
 * Created by Administrator on 2017/12/21.
 */
public class Client {

    public static void main(String[] args) {

        //CarFactory factory = new LuxuryCarFactory();
        CarFactory factory = new LowCarFactory();

        Engine engine = factory.createEngine();
        engine.run();
        engine.start();

        Seat seat = factory.createSeat();
        seat.massage();

        Tyre tyre = factory.createTyre();
        tyre.revolve();

    }

}
