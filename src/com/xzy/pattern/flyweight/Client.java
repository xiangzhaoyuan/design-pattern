package com.xzy.pattern.flyweight;

/**
 * 测试享元模式
 * Created by Administrator on 2017/12/29.
 */
public class Client {

    public static void main(String[] args) {
        ChessFlyWeight chess1 = ChessFlyweightFactory.getChess("黑色");
        ChessFlyWeight chess2 = ChessFlyweightFactory.getChess("黑色");

        System.out.println(chess1);
        System.out.println(chess2);

        System.out.println("增加外部状态的处理......");
        chess1.display(new Coordinate(10,10));
        chess2.display(new Coordinate(20,5));
    }

}
