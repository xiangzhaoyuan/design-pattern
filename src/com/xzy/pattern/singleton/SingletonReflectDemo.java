package com.xzy.pattern.singleton;

/**
 * 饿汉式测试反射漏洞
 * Created by Administrator on 2017/12/16.
 */
public class SingletonReflectDemo {

    //类初始化时，立即创建这个对象的实例（没有延时加载的优势）；加载这个类时，天然线程安全
    private static SingletonReflectDemo instance = new SingletonReflectDemo();

    //私有化构造器
    private SingletonReflectDemo(){
        //反射重复创建对象抛出异常，针对暴力反射，不建议这样使用
        if(instance!=null){
            throw new RuntimeException();
        }
    }

    //不用加synchronized，调用效率高
    public static SingletonReflectDemo getInstance(){
        return instance;
    }

}
