package com.xzy.pattern.state;

/**
 * 已预定状态
 * Created by Administrator on 2018/1/2.
 */
public class BookedState implements State {
    @Override
    public void handle() {
        System.out.println("房间已预定，别人不能定！");
    }
}
