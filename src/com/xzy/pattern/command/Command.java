package com.xzy.pattern.command;

/**
 * 命令抽象类
 * Created by Administrator on 2017/12/30.
 */
public interface Command {
    void execute();
}


class ConcreteCommand implements Command{

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        super();
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
