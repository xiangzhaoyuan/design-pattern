package com.xzy.pattern.singleton;

/**
 * 枚举实现单例模式，实现简单，由JVM从根本上提供保障，避免通过反射和反序列化的漏洞，没有延迟加载
 * Created by Administrator on 2017/12/16.
 */
public enum SingletonDemo7 {

    //枚举元素，本身就是单例对象
    INSTANCE;

    //其他相关的操作
    public void operate(){
        System.out.println("operation!");
    }

}
