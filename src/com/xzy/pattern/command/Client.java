package com.xzy.pattern.command;

/**
 * 测试命令模式
 * Created by Administrator on 2017/12/30.
 */
public class Client {

    public static void main(String[] args) {
        Command command = new ConcreteCommand(new Receiver());
        Invoker invoker = new Invoker(command);
        invoker.call();
    }

}
