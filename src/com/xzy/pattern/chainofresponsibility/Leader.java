package com.xzy.pattern.chainofresponsibility;

/**
 * Created by Administrator on 2017/12/29.
 */
public abstract class Leader {

    protected String name;
    protected Leader nextLeader;//责任链的后继对象

    public Leader(String name) {
        this.name = name;
    }

    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    public abstract void handleRequest(LeaveRequest request);
}
