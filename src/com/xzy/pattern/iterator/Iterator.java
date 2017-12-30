package com.xzy.pattern.iterator;

/**
 * 迭代器
 * Created by Administrator on 2017/12/30.
 */
public interface Iterator {

    //将游标指向第一个
    void first();

    //将游标指向下一个
    void next();

    //判断是否有下一个
    boolean hasNext();

    //判断是否是第一个
    boolean isFirst();

    //判断是否是最后一个
    boolean isLast();

    //获取当前指向的对象
    Object getCurrentObject();

}
