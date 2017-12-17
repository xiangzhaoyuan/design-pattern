package com.xzy.pattern.singleton;

/**
 * 静态内部类实现单例，兼备并发高效调用和延迟加载的优势
 * Created by Administrator on 2017/12/16.
 */
public class SingletonDemo6 {

    //外部类没有static属性，不会像饿汉式那样立即加载对象，实现懒加载

    //加载类是线程安全的，instance是static final类型，保证了内存中只有这样一个实例存在，而且只能被赋值一次，从而保证了线程安全性
    private static class InstanceHolder{
        private static final SingletonDemo6 instance = new SingletonDemo6();
    }

    //私有化构造器
    private SingletonDemo6(){}

    //只有真正调用getInstance才会加载静态内部类
    public static  SingletonDemo6 getInstance(){
        return InstanceHolder.instance;
    }

}
