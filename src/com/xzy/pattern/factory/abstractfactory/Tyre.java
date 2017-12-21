package com.xzy.pattern.factory.abstractfactory;

/**
 * Created by Administrator on 2017/12/21.
 */
public interface Tyre {

    void revolve();

}


class LuxuryTyre implements Tyre{

    @Override
    public void revolve() {
        System.out.println("旋转不磨损!");

    }
}


class LowTyre implements Tyre{

    @Override
    public void revolve() {
        System.out.println("旋转磨损!");

    }
}