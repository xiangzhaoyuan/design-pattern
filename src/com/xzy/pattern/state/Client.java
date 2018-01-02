package com.xzy.pattern.state;

/**
 * 测试状态模式
 * Created by Administrator on 2018/1/2.
 */
public class Client {

    public static void main(String[] args) {
        HouseContext context = new HouseContext();
        context.setState(new FreeState());
        context.setState(new BookedState());
        context.setState(new CheckedInState());
    }

}
