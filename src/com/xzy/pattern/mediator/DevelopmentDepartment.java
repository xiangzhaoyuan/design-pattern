package com.xzy.pattern.mediator;

/**
 * 研发部
 * Created by Administrator on 2017/12/30.
 */
public class DevelopmentDepartment implements Department {

    private Mediator mediator;//持有中介者的引用

    public DevelopmentDepartment(Mediator mediator) {
        super();
        this.mediator = mediator;
        mediator.register("development", this);
    }

    @Override
    public void selfAction() {
        System.out.println("专心研发，开发项目！");
    }

    @Override
    public void outAction() {
        System.out.println("回报工作！没钱了，需要资金支持！");
    }
}
