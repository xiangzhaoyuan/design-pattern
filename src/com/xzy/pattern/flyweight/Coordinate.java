package com.xzy.pattern.flyweight;

/**
 * 外部状态UnsharedConcreteFlyWeight
 * Created by Administrator on 2017/12/29.
 */
public class Coordinate {

    private int x,y;

    public Coordinate(int y, int x) {
        this.y = y;
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
