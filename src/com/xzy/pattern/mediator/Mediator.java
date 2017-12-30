package com.xzy.pattern.mediator;

/**
 * 抽象中介者Mediator
 * Created by Administrator on 2017/12/30.
 */
public interface Mediator {

    void register(String dname, Department department);

    void command(String dname);

}
