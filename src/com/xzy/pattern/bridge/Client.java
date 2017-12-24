package com.xzy.pattern.bridge;

/**
 * 测试桥接模式
 * Created by Administrator on 2017/12/24.
 */
public class Client {

    public static void main(String[] args) {
        //销售联想的笔记本电脑
        Computer2 c1 = new Laptop2(new Lenovo());
        c1.sale();

        //销售苹果手机
        Computer2 c2 = new Phone(new Apple());
        c2.sale();
    }

}
