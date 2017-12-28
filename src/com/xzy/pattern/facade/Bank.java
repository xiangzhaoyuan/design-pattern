package com.xzy.pattern.facade;

/**
 * 银行
 * Created by Administrator on 2017/12/28.
 */
public interface Bank {
    void openAccount();
}

class ICBC implements Bank{

    @Override
    public void openAccount() {
        System.out.println("在中国工商银行开户");
    }
}