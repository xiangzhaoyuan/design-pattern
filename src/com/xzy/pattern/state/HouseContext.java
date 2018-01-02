package com.xzy.pattern.state;

/**
 * 房间环境类
 * Created by Administrator on 2018/1/2.
 */
public class HouseContext {

    private State state;

    public void setState(State state){
        System.out.println("修改状态...");
        this.state = state;
        state.handle();
    }

}
