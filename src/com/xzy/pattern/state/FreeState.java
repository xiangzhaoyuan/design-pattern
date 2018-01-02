package com.xzy.pattern.state;

/**
 * 空闲状态
 * Created by Administrator on 2018/1/2.
 */
public class FreeState implements State{
    @Override
    public void handle() {
        System.out.println("房间空闲，没人住！");
    }
}
