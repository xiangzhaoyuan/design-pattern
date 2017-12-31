package com.xzy.pattern.strategy;

/**
 * 测试不用策略模式：实现起来比较容易，符合一般开发人员的思路
 * 假如类型特别多，算法比较复杂时，整个条件语句代码变得很长，难以维护
 * 如果新增条件需要修改代码，不符合开闭原则
 * Created by Administrator on 2017/12/31.
 */
public class TestNoStrategy {

    public static void main(String[] args) {
        System.out.println(getPrice("普通客户大批量", 25600));
    }

    public static double getPrice(String type, double price) {
        if ("普通客户小批量".equals(type)) {
            System.out.println("不打折，原价");
            return price;
        } else if ("普通客户大批量".equals(type)) {
            System.out.println("打九折");
            return price * 0.9;
        } else if ("老客户小批量".equals(type)) {
            System.out.println("打八五折");
            return price * 0.85;
        } else if ("老客户大批量".equals(type)) {
            System.out.println("打八折");
            return price * 0.8;
        }
        return price;
    }

}
