package com.xzy.pattern.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * 测试动态代理
 * Created by Administrator on 2017/12/23.
 */
public class Client {

    public static void main(String[] args) {
        Star realStar = new RealStar();
        StarHandler handler = new StarHandler(realStar);
        Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                new Class[]{Star.class}, handler);
        proxy.sing();
    }


}
