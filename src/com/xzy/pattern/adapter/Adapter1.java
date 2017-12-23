package com.xzy.pattern.adapter;

/**
 * 适配器(相当于USB和PS/2的转换器)，使用继承实现，灵活性稍差
 * Created by Administrator on 2017/12/23.
 */
public class Adapter1 extends Adaptee implements Target{

    @Override
    public void handleRequest() {
        request();
    }

}
