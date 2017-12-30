package com.xzy.pattern.iterator;

/**
 * 测试迭代器模式
 * Created by Administrator on 2017/12/30.
 */
public class Client {

    public static void main(String[] args) {
        ConcreteAggregate cma = new ConcreteAggregate();
        cma.addObject("aa");
        cma.addObject("bb");
        cma.addObject("cc");
        cma.addObject("dd");

        Iterator iterator = cma.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.getCurrentObject());
            iterator.next();
        }
    }

}
