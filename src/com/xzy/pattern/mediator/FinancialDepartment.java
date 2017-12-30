package com.xzy.pattern.mediator;

/**
 * 财务部
 * Created by Administrator on 2017/12/30.
 */
public class FinancialDepartment implements Department {

    private Mediator mediator;//持有中介者的引用

    public FinancialDepartment(Mediator mediator) {
        super();
        this.mediator = mediator;
        mediator.register("financial", this);
    }

    @Override
    public void selfAction() {
        System.out.println("数钱！");
    }

    @Override
    public void outAction() {
        System.out.println("回报工作！我在数钱！");
    }
}
