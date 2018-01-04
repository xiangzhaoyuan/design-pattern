package com.xzy.pattern.observer.v2;

import java.util.Observable;

/**
 * 具体主题（具体被观察者）， 继承JDK提供的java.util.Observable
 * Created by Administrator on 2018/1/3.
 */
public class ConcreteSubject extends Observable {

    private int state;

    public int getState() {
        return state;
    }

    public void set(int state) {
        this.state = state;//目标对象的状态发生了改变

        setChanged();//表示目标对象已经做了更改
        notifyObservers();//通知所有观察者
    }

}
