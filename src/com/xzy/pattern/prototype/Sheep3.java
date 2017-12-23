package com.xzy.pattern.prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * 序列化实现深克隆
 * Created by Administrator on 2017/12/23.
 */
public class Sheep3 implements Serializable {//实现Serializable接口（标记接口）,可序列化

    private String name;
    private Date birthday;

    public Sheep3() {
    }

    public Sheep3(String name, Date birthday) {
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

}
