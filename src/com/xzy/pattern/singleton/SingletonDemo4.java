package com.xzy.pattern.singleton;

/**
 * 双重检验锁(DCL)版本二(由于编译器的优化，也会和版本一同样的问题)
 * Created by Administrator on 2017/12/16.
 */
public class SingletonDemo4 {

    //类初始化时，不立即创建这个对象的实例（延时加载，懒加载）
    private static SingletonDemo4 instance = null;

    //私有化构造器
    private SingletonDemo4(){}

    /**
     * 试图引进局部变量和第二个synchronized来解决指令重排序的问题。
     * 但是Java语言规范虽然规定了同步代码块内的代码必须在对象锁释放之前执行完毕，却没有规定同步代码块之外的代码不能在对象锁释放之前执行，
     * 也就是说“instance = temp”可能会在编译期或者运行期移到里层的synchronized内，
     * （JIT编译器会把1、2处的代码优化为“instance = new SingletonDemo4();”），于是又会引发跟DCL一样的问题。
     */
    public static SingletonDemo4 getInstance(){
        if(instance==null ){
            synchronized (SingletonDemo4.class){
                SingletonDemo4 temp = instance;
                if(temp == null){
                    synchronized (SingletonDemo4.class){
                        temp = new SingletonDemo4();//1
                    }
                    instance = temp;//2
                }
            }
        }
        return instance;
    }

}
