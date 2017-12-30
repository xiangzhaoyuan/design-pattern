package com.xzy.pattern.chainofresponsibility;

/**
 * 总经理
 * Created by Administrator on 2017/12/29.
 */
public class GeneralManager extends Leader {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() >= 10 && request.getLeaveDays()<30) {
            System.out.println("员工：" + request.getName() +
                    "，请假天数：" + request.getLeaveDays() + "，理由：" + request.getReason());
            System.out.println("总经理：" + this.name + "，审批通过！");
        } else {
            if (this.nextLeader != null) {
                this.nextLeader.handleRequest(request);
            }else{
                System.out.println("这货想辞职！");
            }
        }
    }
}
