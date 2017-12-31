package com.xzy.pattern.strategy;

/**
 * 负责和具体的策略类交互
 * 具体的算法和直接的客户端调用分离了，使得算法可以独立于客户端的变化
 * Created by Administrator on 2017/12/31.
 */
public class Context {

    private Strategy strategy;//当前采用的算法对象

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void printPrice(double s) {
        System.out.println("您的报价:" + strategy.getPrice(s));
    }

}
