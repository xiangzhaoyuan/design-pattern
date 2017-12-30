package com.xzy.pattern.mediator;

/**
 * 市场部
 * Created by Administrator on 2017/12/30.
 */
public class MarketDepartment implements Department {

    private Mediator mediator;//持有中介者的引用

    public MarketDepartment(Mediator mediator) {
        super();
        this.mediator = mediator;
        mediator.register("market", this);
    }

    @Override
    public void selfAction() {
        System.out.println("跑去接项目！");
    }

    @Override
    public void outAction() {
        System.out.println("回报工作！项目承接的进度，需要资金支持！");
        mediator.command("financial");
    }
}
