package com.xzy.pattern.bridge;

/**
 * 通过继承表示电脑的分类结构，缺点：1、类的数量膨胀；2、不符合单一职责原则
 * Created by Administrator on 2017/12/24.
 */
public interface Computer1 {
    void sale();
}


class Desktop1 implements Computer1 {
    @Override
    public void sale() {
        System.out.println("销售台式机");
    }
}
class Laptop1 implements Computer1 {
    @Override
    public void sale() {
        System.out.println("销售笔记本");
    }
}
class Pad1 implements Computer1 {
    @Override
    public void sale() {
        System.out.println("销售平板电脑");
    }
}


class LenovoDesktop extends Desktop1 {
    @Override
    public void sale() {
        System.out.println("销售联想台式机");
    }
}
class LenovoLaptop extends Laptop1 {
    @Override
    public void sale() {
        System.out.println("销售联想笔记本");
    }
}
class LenovoPad extends Pad1 {
    @Override
    public void sale() {
        System.out.println("销售联想平板电脑");
    }
}


class ShenzhouDesktop extends Desktop1 {
    @Override
    public void sale() {
        System.out.println("销售神舟台式机");
    }
}
class ShenzhouLaptop extends Laptop1 {
    @Override
    public void sale() {
        System.out.println("销售神舟笔记本");
    }
}
class ShenzhouPad extends Pad1 {
    @Override
    public void sale() {
        System.out.println("销售神舟平板电脑");
    }
}


class DellDesktop extends Desktop1 {
    @Override
    public void sale() {
        System.out.println("销售戴尔台式机");
    }
}
class DellLaptop extends Laptop1 {
    @Override
    public void sale() {
        System.out.println("销售戴尔笔记本");
    }
}
class DellPad extends Pad1 {
    @Override
    public void sale() {
        System.out.println("销售戴尔平板电脑");
    }
}