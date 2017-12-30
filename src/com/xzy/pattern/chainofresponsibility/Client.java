package com.xzy.pattern.chainofresponsibility;

/**
 * 测试责任链模式
 * Created by Administrator on 2017/12/29.
 */
public class Client {

    public static void main(String[] args) {
        Leader a = new Director("张三");
        Leader b = new Manager("李四");
        Leader c = new GeneralManager("王五");

        //组织关系
        a.setNextLeader(b);
        b.setNextLeader(c);

        //请假操作
        LeaveRequest request = new LeaveRequest("tom",50,"回家英国老家探亲");
        a.handleRequest(request);

    }

}
