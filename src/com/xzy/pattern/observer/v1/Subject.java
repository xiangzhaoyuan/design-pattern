package com.xzy.pattern.observer.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题（抽象被观察者）
 * Created by Administrator on 2018/1/3.
 */
public class Subject {

    protected List<Observer> list = new ArrayList<Observer>();

    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : list) {
            observer.update(this);
        }
    }


}
