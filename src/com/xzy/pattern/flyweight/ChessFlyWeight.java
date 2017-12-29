package com.xzy.pattern.flyweight;

/**
 * 享元类FlyWeight
 * Created by Administrator on 2017/12/29.
 */
public interface ChessFlyWeight {

    String getColor();

    void setColor(String color);

    void display(Coordinate c);

}

//具体享元类ConcreteFlyWeight
class ConcreteChess implements ChessFlyWeight {

    private String color;

    public ConcreteChess(String color) {
        super();
        this.color = color;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void display(Coordinate c) {
        System.out.println("棋子颜色：" + color);
        System.out.println("棋子位置：（" + c.getX() + "," + c.getY() + "）");
    }
}