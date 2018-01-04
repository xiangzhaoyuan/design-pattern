package com.xzy.pattern.observer.v2;

/**
 * 测试观察者模式（用JDK的类实现）
 * Created by Administrator on 2018/1/3.
 */
public class Client {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        ObserverA observerA1 = new ObserverA();
        ObserverA observerA2 = new ObserverA();
        ObserverA observerA3 = new ObserverA();

        subject.addObserver(observerA1);
        subject.addObserver(observerA2);
        subject.addObserver(observerA3);

        System.out.println("observerA1:" + observerA1.getMyState());
        System.out.println("observerA2:" + observerA2.getMyState());
        System.out.println("observerA3:" + observerA3.getMyState());

        System.out.println("============更新状态==============");
        subject.set(3000);

        System.out.println("observerA1:" + observerA1.getMyState());
        System.out.println("observerA2:" + observerA2.getMyState());
        System.out.println("observerA3:" + observerA3.getMyState());
    }

}
