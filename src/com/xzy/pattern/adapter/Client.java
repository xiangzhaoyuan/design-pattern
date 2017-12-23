package com.xzy.pattern.adapter;

/**
 * 客户端类（相当于有USB接口的笔记本电脑）
 * Created by Administrator on 2017/12/23.
 */
public class Client {

    public static void main(String[] args) {

        //继承实现测试
        /*Client client = new Client();
        Target target = new Adapter1();
        client.test(target);*/

        //组合实现测试
        Client client = new Client();
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter2(adaptee);
        client.test(target);
    }

    public void test(Target target){
        target.handleRequest();
    }

}
