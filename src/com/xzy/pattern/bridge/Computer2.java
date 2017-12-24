package com.xzy.pattern.bridge;

/**
 * 电脑类型维度
 * Created by Administrator on 2017/12/24.
 */
public class Computer2 {

    protected Brand brand;

    public Computer2(Brand brand) {
        this.brand = brand;
    }

    public void sale(){
        brand.sale();
    }
}


class Desktop2 extends Computer2{

    public Desktop2(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售台式机");
    }
}

class Laptop2 extends Computer2{

    public Laptop2(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售笔记本");
    }
}


class Pad2 extends Computer2{

    public Pad2(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售平板电脑");
    }
}

//添加销售手机类型
class Phone extends Computer2{

    public Phone(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售手机");
    }
}