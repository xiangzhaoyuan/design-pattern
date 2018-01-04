package com.xzy.pattern.observer.v2;

import java.util.Observable;
import java.util.Observer;

/**
 * 具体观察者，实现JDK提供的观察者接口(java.util.Observer)
 * Created by Administrator on 2018/1/4.
 */
public class ObserverA implements Observer {

    private int myState;

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }

    @Override
    public void update(Observable o, Object arg) {
        this.myState = ((ConcreteSubject) o).getState();
    }
}
