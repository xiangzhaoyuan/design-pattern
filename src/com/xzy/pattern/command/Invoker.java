package com.xzy.pattern.command;

/**
 * 命令的调用者/发起者
 * Created by Administrator on 2017/12/30.
 */
public class Invoker {

    //也可以通过容器List<Command>容纳很多命令对象。进行批处理。数据库底层的事务处理就是这种结构
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    //业务方法，用于调用命令类的方法
    public void call(){
        command.execute();
    }
}
