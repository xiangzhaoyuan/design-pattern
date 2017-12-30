package com.xzy.pattern.mediator;

/**
 * 测试中介者模式
 * Created by Administrator on 2017/12/30.
 */
public class Client {
    public static void main(String[] args) {
        Mediator m = new President();
        MarketDepartment market = new MarketDepartment(m);
        DevelopmentDepartment develop = new DevelopmentDepartment(m);
        FinancialDepartment financial = new FinancialDepartment(m);

        market.selfAction();
        market.outAction();
    }
}
