package com.xzy.pattern.template;

/**
 * Created by Administrator on 2018/1/1.
 */
public class Client {

    public static void main(String[] args) {
        BankTemplateMethod btm1 = new DrawMoney();
        btm1.process();

        //匿名内部类实现
        BankTemplateMethod btm2 = new BankTemplateMethod() {
            @Override
            public void transact() {
                System.out.println("我要存钱...");
            }
        };
        btm2.process();
    }

}
