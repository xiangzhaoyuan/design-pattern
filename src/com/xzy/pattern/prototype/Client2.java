package com.xzy.pattern.prototype;

import java.util.Date;

/**
 * 测试深复制
 * Created by Administrator on 2017/12/22.
 */
public class Client2 {

    public static void main(String[] args) throws Exception {
        Sheep2 s1 = new Sheep2("多利",new Date(12312321331L));
        Sheep2 s2 = s1.clone();

        //修改sheep1的birthday属性却不会影响sheep2，原因：这里实现的是深复制
        s1.getBirthday().setTime(15712321331L);
        System.out.println(s1.getBirthday());
        System.out.println(s2.getBirthday());
    }

}
