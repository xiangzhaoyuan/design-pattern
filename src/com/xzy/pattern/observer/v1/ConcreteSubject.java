package com.xzy.pattern.observer.v1;

/**
 * 具体主题（具体被观察者）
 * Created by Administrator on 2018/1/3.
 */
public class ConcreteSubject extends Subject {

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        //主题对象或目标对象更新通知所有观察者
        this.notifyObservers();
    }


}
