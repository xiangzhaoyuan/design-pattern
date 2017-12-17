package com.xzy.pattern.singleton;

/**
 * 双重检验锁(DCL)版本一(多线程环境下指令重排序会导致问题)
 * Created by Administrator on 2017/12/16.
 */
public class SingletonDemo3 {

    //类初始化时，不立即创建这个对象的实例（延时加载，懒加载）
    private static SingletonDemo3 instance = null;

    //私有化构造器
    private SingletonDemo3() {
    }

    //为了解决懒汉式调用效率低的问题使用双重检查加锁，看似完美，实际有问题
    //问题：指令重排序可能会使“初始化对象”和“设置instance指向刚分配的内存地址”两步顺序调换导致执行结果在单线程结果一样，
    //但是在多线程中得到未被完全初始化的实例
    public static SingletonDemo3 getInstance() {
        if (instance == null) {
            synchronized (SingletonDemo3.class) {
                if (instance == null) {
                    instance = new SingletonDemo3();
                }
            }
        }
        return instance;
    }

}
