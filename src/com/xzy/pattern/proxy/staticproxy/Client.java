package com.xzy.pattern.proxy.staticproxy;

/**
 * 测试静态代理
 * Created by Administrator on 2017/12/23.
 */
public class Client {

    public static void main(String[] args) {
        Star real = new RealStar();
        Star proxy = new ProxyStar(real);

        proxy.confer();
        proxy.signContract();
        proxy.bookTicket();
        proxy.sing();
        proxy.collectMoney();
    }

}
