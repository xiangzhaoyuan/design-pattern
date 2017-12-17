package com.xzy.pattern.singleton;

/**
 * 懒汉式单例测试
 * Created by Administrator on 2017/12/16.
 */
public class SingletonDemo2 {

    //类初始化时，不立即创建这个对象的实例（延时加载，懒加载）
    private static SingletonDemo2 instance;

    //私有化构造器
    private SingletonDemo2(){}

    //不加synchronized多线程下会有问题；方法同步，调用效率低
    public static synchronized SingletonDemo2 getInstance(){
        if(instance==null ){
            instance = new SingletonDemo2();
        }
        return instance;
    }

}
