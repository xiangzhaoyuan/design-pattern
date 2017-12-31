package com.xzy.pattern.strategy;

/**
 * 测试策略模式
 * Created by Administrator on 2017/12/31.
 */
public class Client {

    public static void main(String[] args) {
        Strategy strategy = new NewCustomBatchStrategy();
        Context context = new Context(strategy);
        context.printPrice(998);
    }

}
