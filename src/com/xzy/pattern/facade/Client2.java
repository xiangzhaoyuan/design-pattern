package com.xzy.pattern.facade;

/**
 * 测试使用外观模式
 * Created by Administrator on 2017/12/28.
 */
public class Client2 {

    public static void main(String[] args) {
        new RegisterFacade().register();
    }

}
