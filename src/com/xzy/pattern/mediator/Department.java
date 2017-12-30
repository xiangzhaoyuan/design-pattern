package com.xzy.pattern.mediator;

/**
 * 同事类接口Colleague
 * Created by Administrator on 2017/12/30.
 */
public interface Department {

    void selfAction();//做本部门的事情

    void outAction();//向总经理发出申请

}
