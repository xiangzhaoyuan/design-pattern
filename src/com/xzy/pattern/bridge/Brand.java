package com.xzy.pattern.bridge;

/**
 * 品牌维度
 * Created by Administrator on 2017/12/24.
 */
public interface Brand {
    void sale();
}

class Lenovo implements Brand{
    @Override
    public void sale() {
        System.out.println("联想品牌");
    }
}

class Dell implements Brand{
    @Override
    public void sale() {
        System.out.println("戴尔品牌");
    }
}

class Shenzhou implements Brand{
    @Override
    public void sale() {
        System.out.println("神舟品牌");
    }
}

class Apple implements Brand{
    @Override
    public void sale() {
        System.out.println("苹果品牌");
    }
}