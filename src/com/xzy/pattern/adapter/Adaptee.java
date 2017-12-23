package com.xzy.pattern.adapter;

/**
 * 被适配的类（相当于有PS/2接口的键盘)
 * Created by Administrator on 2017/12/23.
 */
public class Adaptee {

    public void request(){
        System.out.println("可以完成客户需要的功能!");
    }

}
