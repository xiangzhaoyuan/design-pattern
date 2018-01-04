package com.xzy.pattern.memento;

/**
 * 负责人类，负责管理备忘录对象
 * Created by Administrator on 2018/1/5.
 */
public class CareTaker {

    private EmployeeMemento memento;

    //可以通过容器设置多个备份点
    //private List<EmployeeMemento> list = new ArrayList<EmployeeMemento>();

    public EmployeeMemento getMemento() {
        return memento;
    }

    public void setMemento(EmployeeMemento memento) {
        this.memento = memento;
    }
}
