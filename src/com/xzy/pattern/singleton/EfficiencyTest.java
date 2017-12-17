package com.xzy.pattern.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * 测试各种单例效率
 * 饿汉式：110ms
 * 懒汉式：923ms
 * 双重检验锁：101ms
 * 静态内部类：66ms
 * 枚举式：45ms
 * Created by Administrator on 2017/12/17.
 */
public class EfficiencyTest {

    private static final int THREAD_NUM = 10;
    private static final int COUNT = 1000000;

    public static void main(String[] args) throws Exception {

        final CountDownLatch latch = new CountDownLatch(THREAD_NUM);
        long start = System.currentTimeMillis();

        for (int i = 0; i < THREAD_NUM; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < COUNT; j++) {
                        Object o = SingletonDemo7.INSTANCE;
                    }
                    latch.countDown();
                }
            }).start();
        }
        latch.await();//main线程阻塞，直到计数器为0才会继续往下执行

        long end = System.currentTimeMillis();
        System.out.println("end-start:" + (end - start));

    }

}
