package com.xzy.pattern.singleton;

import java.io.*;

/**
 * 测试单例模式反序列化漏洞
 * Created by Administrator on 2017/12/16.
 */
public class SerializeTest {

    public static void main(String[] args){
        try {
            SingletonSerializeDemo demo1 = SingletonSerializeDemo.getInstance();
            System.out.println(demo1);
            SingletonSerializeDemo demo2 = SingletonSerializeDemo.getInstance();
            System.out.println(demo2);

            FileOutputStream fos = new FileOutputStream("a.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(demo1);
            oos.close();
            fos.close();

            FileInputStream fis = new FileInputStream("a.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            SingletonSerializeDemo demo3 = (SingletonSerializeDemo)ois.readObject();
            ois.close();
            fis.close();
            System.out.println(demo3);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
