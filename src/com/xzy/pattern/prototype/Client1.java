package com.xzy.pattern.prototype;

import java.util.Date;

/**
 * 测试浅复制
 * Created by Administrator on 2017/12/22.
 */
public class Client1 {

    public static void main(String[] args) throws Exception {
        Sheep1 s1 = new Sheep1("多利",new Date(12312321331L));
        System.out.println(s1);
        System.out.println(s1.getName());
        System.out.println(s1.getBirthday());

        //sheep2与sheep1是两个对象，但是内部属性都一样
        Sheep1 s2 = s1.clone();
        System.out.println(s2);
        System.out.println(s2.getName());
        System.out.println(s2.getBirthday());

        //修改sheep2的name属性不影响sheep1
        s2.setName("莉莉");
        System.out.println(s1.getName());
        System.out.println(s2.getName());

        //修改sheep1的birthday属性却会影响sheep2，原因：这里实现的是浅复制
        s1.getBirthday().setTime(15712321331L);
        System.out.println(s1.getBirthday());
        System.out.println(s2.getBirthday());
    }

}
