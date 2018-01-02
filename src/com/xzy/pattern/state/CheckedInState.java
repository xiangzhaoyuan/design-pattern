package com.xzy.pattern.state;

/**
 * 已入住状态
 * Created by Administrator on 2018/1/2.
 */
public class CheckedInState implements State {
    @Override
    public void handle() {
        System.out.println("房间已入住，请勿打扰！");
    }
}
