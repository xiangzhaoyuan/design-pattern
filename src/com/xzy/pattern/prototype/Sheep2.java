package com.xzy.pattern.prototype;

import java.util.Date;

/**
 * 实现深复制
 * Created by Administrator on 2017/12/22.
 */
public class Sheep2 implements Cloneable{//实现Cloneable接口（标记接口）

    private String name;
    private Date birthday;

    public Sheep2() {
    }

    public Sheep2(String name, Date birthday) {
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
    protected Sheep2 clone() throws CloneNotSupportedException {
        Sheep2 s = (Sheep2)super.clone();
        s.setBirthday((Date)this.birthday.clone());//将birthday手动复制进去，实现的是深复制
        return s;
    }
}
