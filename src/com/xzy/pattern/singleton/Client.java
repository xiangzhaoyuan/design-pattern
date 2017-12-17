package com.xzy.pattern.singleton;

/**
 * Created by Administrator on 2017/12/16.
 */
public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        //client.testSingletonDemo1();
        //client.testSingletonDemo2();
        client.testSingletonDemo6();
    }

    //测试饿汉式单例
    private void testSingletonDemo1(){
        SingletonDemo1 demo1 = SingletonDemo1.getInstance();
        SingletonDemo1 demo2 = SingletonDemo1.getInstance();
        System.out.println(demo1 == demo2);
    }

    //测试懒汉式单例
    private void testSingletonDemo2(){
        SingletonDemo2 demo1 = SingletonDemo2.getInstance();
        SingletonDemo2 demo2 = SingletonDemo2.getInstance();
        System.out.println(demo1 == demo2);
    }

    //测试静态内部类单例
    private void testSingletonDemo6(){
        SingletonDemo6 demo1 = SingletonDemo6.getInstance();
        SingletonDemo6 demo2 = SingletonDemo6.getInstance();
        System.out.println(demo1 == demo2);
    }

}
