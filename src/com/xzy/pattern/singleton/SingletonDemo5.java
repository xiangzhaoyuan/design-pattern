package com.xzy.pattern.singleton;

/**
 * 双重检验锁(DCL)版本三(使用volatile变量禁止指令重排序)
 * Created by Administrator on 2017/12/16.
 */
public class SingletonDemo5 {

    //类初始化时，不立即创建这个对象的实例（延时加载，懒加载）
    //JDK1.5之后，可以使用volatile变量禁止指令重排序，让DCL生效
    private static volatile SingletonDemo5 instance;

    //私有化构造器
    private SingletonDemo5() {
    }

    //不会出现问题，
    public static SingletonDemo5 getInstance() {
        if (instance == null) {
            synchronized (SingletonDemo5.class) {
                if (instance == null) {
                    instance = new SingletonDemo5();
                }
            }
        }
        return instance;
    }

}
