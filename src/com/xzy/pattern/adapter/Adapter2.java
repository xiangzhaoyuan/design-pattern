package com.xzy.pattern.adapter;

/**
 * 适配器(相当于USB和PS/2的转换器)，使用组合实现
 * Created by Administrator on 2017/12/23.
 */
public class Adapter2 implements Target {

    private Adaptee adaptee;

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleRequest() {
        adaptee.request();
    }

}
