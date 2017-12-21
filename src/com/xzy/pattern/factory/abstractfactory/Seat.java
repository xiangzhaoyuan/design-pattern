package com.xzy.pattern.factory.abstractfactory;

/**
 * Created by Administrator on 2017/12/21.
 */
public interface Seat {

    void massage();

}


class LuxurySeat implements Seat{

    @Override
    public void massage() {
        System.out.println("能按摩!");
    }

}


class LowSeat implements Seat{

    @Override
    public void massage() {
        System.out.println("不能按摩!");
    }

}
