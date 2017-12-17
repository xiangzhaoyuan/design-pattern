package com.xzy.pattern.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 懒汉式单例测试序列化漏洞
 * Created by Administrator on 2017/12/16.
 */
public class SingletonSerializeDemo implements Serializable {

    //类初始化时，不立即创建这个对象的实例（延时加载，懒加载）
    private static SingletonSerializeDemo instance;

    //私有化构造器
    private SingletonSerializeDemo(){}

    //不加synchronized多线程下会有问题；方法同步，调用效率低
    public static synchronized SingletonSerializeDemo getInstance(){
        if(instance==null ){
            instance = new SingletonSerializeDemo();
        }
        return instance;
    }

    //反序列化时，如果定义了readResolve方法（实际是一种回调），则直接返回此方法指定的对象，而不需要单独再创建对象
    private Object readResolve() throws ObjectStreamException{
        return instance;
    }

}
