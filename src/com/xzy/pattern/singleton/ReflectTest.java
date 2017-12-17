package com.xzy.pattern.singleton;

import java.lang.reflect.Constructor;

/**
 * 测试单例模式反射漏洞
 * Created by Administrator on 2017/12/16.
 */
public class ReflectTest {

    public static void main(String[] args) {
        SingletonReflectDemo demo1 = SingletonReflectDemo.getInstance();
        SingletonReflectDemo demo2 = SingletonReflectDemo.getInstance();
        System.out.println(demo1);
        System.out.println(demo2);

        try {
            Class<SingletonReflectDemo> clazz = (Class<SingletonReflectDemo>)Class
                    .forName("com.xzy.pattern.singleton.SingletonReflectDemo");
            Constructor<SingletonReflectDemo> constructor = clazz.getDeclaredConstructor(null);
            constructor.setAccessible(true);

            SingletonReflectDemo demo3 = constructor.newInstance();
            SingletonReflectDemo demo4 = constructor.newInstance();
            System.out.println(demo3);
            System.out.println(demo4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
