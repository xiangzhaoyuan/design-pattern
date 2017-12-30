package com.xzy.pattern.chainofresponsibility;

/**
 * 经理
 * Created by Administrator on 2017/12/29.
 */
public class Manager extends Leader {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() >= 3 && request.getLeaveDays()<10) {
            System.out.println("员工：" + request.getName() +
                    ",请假天数：" + request.getLeaveDays() + "，理由：" + request.getReason());
            System.out.println("经理：" + this.name + "，审批通过！");
        } else {
            if (this.nextLeader != null) {
                this.nextLeader.handleRequest(request);
            }
        }
    }
}
