package com.xzy.pattern.singleton;

/**
 * 饿汉式单例测试
 * Created by Administrator on 2017/12/16.
 */
public class SingletonDemo1 {

    //类初始化时，立即创建这个对象的实例（没有延时加载的优势）；加载这个类时，天然线程安全
    private static SingletonDemo1 instance = new SingletonDemo1();

    //私有化构造器
    private SingletonDemo1(){}

    //不用加synchronized，调用效率高
    public static SingletonDemo1 getInstance(){
        return instance;
    }

}
