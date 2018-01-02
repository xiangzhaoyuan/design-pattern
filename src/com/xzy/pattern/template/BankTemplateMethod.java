package com.xzy.pattern.template;

/**
 * Created by Administrator on 2018/1/1.
 */
public abstract class BankTemplateMethod {

    public void takeNumber(){
        System.out.println("取号排队");
    }

    //办理具体的业务，钩子方法
    public abstract void transact();

    public void evaluate(){
        System.out.println("反馈评分");
    }

    public final void process(){
        this.takeNumber();
        this.transact();
        this.evaluate();
    }

}
