package com.xzy.pattern.prototype;

/**
 * 测试new创建对象和clone创建对象的效率差异
 * 如果需要短时间创建大量对象，并且创建对象比较耗时，可以考虑使用克隆
 * Created by Administrator on 2017/12/23.
 */
public class Client4 {

    public static void main(String[] args) throws Exception {
        int count = 1000;
        testNew(count);
        testClone(count);
    }

    private static void testNew(int count) {
        long start = System.currentTimeMillis();
        Laptop laptop = new Laptop();
        for (int i = 0; i < count - 1; i++) {
            Laptop temp = new Laptop();
        }
        long end = System.currentTimeMillis();
        System.out.println("new创建对象耗时:" + (end - start));
    }

    private static void testClone(int count) throws CloneNotSupportedException {
        long start = System.currentTimeMillis();
        Laptop laptop = new Laptop();
        for (int i = 0; i < count - 1; i++) {
            Laptop temp = (Laptop) laptop.clone();
        }
        long end = System.currentTimeMillis();
        System.out.println("clone创建对象耗时:" + (end - start));
    }
}

class Laptop implements Cloneable {

    public Laptop() {
        try {
            Thread.sleep(5);//模拟耗时的创建对象过程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}