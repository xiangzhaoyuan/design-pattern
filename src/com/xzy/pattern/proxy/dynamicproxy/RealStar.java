package com.xzy.pattern.proxy.dynamicproxy;

/**
 * 真实角色
 * Created by Administrator on 2017/12/23.
 */
public class RealStar implements Star {

    @Override
    public void confer() {
        System.out.println("RealStar confer!");
    }

    @Override
    public void signContract() {
        System.out.println("RealStar signContract!");
    }

    @Override
    public void bookTicket() {
        System.out.println("RealStar bookTicket!");
    }

    @Override
    public void sing() {
        System.out.println("RealStar(周杰伦) sing!");
    }

    @Override
    public void collectMoney() {
        System.out.println("RealStar collectMoney!");
    }

}
