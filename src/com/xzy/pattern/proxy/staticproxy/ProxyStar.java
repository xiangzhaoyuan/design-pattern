package com.xzy.pattern.proxy.staticproxy;

/**
 * 代理角色
 * Created by Administrator on 2017/12/23.
 */
public class ProxyStar implements Star {

    private Star star;//通过组合方式持有真实角色的引用，可以调用真实角色的方法

    public ProxyStar(Star star) {
        this.star = star;
    }

    @Override
    public void confer() {
        System.out.println("ProxyStar confer!");
    }

    @Override
    public void signContract() {
        System.out.println("ProxyStar signContract!");
    }

    @Override
    public void bookTicket() {
        System.out.println("ProxyStar bookTicket!");
    }

    @Override
    public void sing() {
        star.sing();
    }

    @Override
    public void collectMoney() {
        System.out.println("ProxyStar collectMoney!");
    }
}
