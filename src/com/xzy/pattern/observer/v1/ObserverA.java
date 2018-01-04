package com.xzy.pattern.observer.v1;

/**
 * 具体观察者
 * Created by Administrator on 2018/1/3.
 */
public class ObserverA implements Observer {

    private int myState;//myState需要和目标对象的state值保持一致

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }

    @Override
    public void update(Subject subject) {
        myState = ((ConcreteSubject) subject).getState();
    }
}
