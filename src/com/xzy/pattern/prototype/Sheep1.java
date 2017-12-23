package com.xzy.pattern.prototype;

import java.util.Date;

/**
 * 实现浅复制
 * Created by Administrator on 2017/12/22.
 */
public class Sheep1 implements Cloneable{//实现Cloneable接口（标记接口）

    private String name;
    private Date birthday;

    public Sheep1() {
    }

    public Sheep1(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    //覆盖Object类中的clone方法
    @Override
    protected Sheep1 clone() throws CloneNotSupportedException {
        return (Sheep1)super.clone();//直接调用父类中的clone方法，实现的是浅复制
    }
}
