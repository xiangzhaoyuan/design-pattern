package com.xzy.pattern.observer.v1;

/**
 * 测试观察者模式
 * Created by Administrator on 2018/1/3.
 */
public class Client {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        ObserverA observerA1 = new ObserverA();
        ObserverA observerA2 = new ObserverA();
        ObserverA observerA3 = new ObserverA();

        subject.registerObserver(observerA1);
        subject.registerObserver(observerA2);
        subject.registerObserver(observerA3);

        System.out.println("observerA1:"+observerA1.getMyState());
        System.out.println("observerA2:"+observerA2.getMyState());
        System.out.println("observerA3:"+observerA3.getMyState());

        System.out.println("============更新状态==============");
        subject.setState(3000);
        System.out.println("observerA1:"+observerA1.getMyState());
        System.out.println("observerA2:"+observerA2.getMyState());
        System.out.println("observerA3:"+observerA3.getMyState());    }

}
