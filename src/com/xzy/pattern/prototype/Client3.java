package com.xzy.pattern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * 测试序列化实现深克隆
 * Created by Administrator on 2017/12/23.
 */
public class Client3 {

    public static void main(String[] args) throws Exception {
        Sheep3 s1 = new Sheep3("多利",new Date(12312321331L));
        System.out.println(s1);
        System.out.println(s1.getName());
        System.out.println(s1.getBirthday());

        //序列化反序列化对象s1
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(s1);
        byte[] bytes = bos.toByteArray();
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Sheep3 s2 = (Sheep3)ois.readObject();

        //sheep2与sheep1是两个对象，但是内部属性都一样
        System.out.println(s2);
        System.out.println(s2.getName());
        System.out.println(s2.getBirthday());

        System.out.println("============================");

        //修改sheep1的birthday属性却不会影响sheep2，原因：这里实现的是深复制(序列化实现)
        s1.getBirthday().setTime(15712321331L);
        System.out.println(s1.getBirthday());
        System.out.println(s2.getBirthday());
    }

}
