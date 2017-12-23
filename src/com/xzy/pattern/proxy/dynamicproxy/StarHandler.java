package com.xzy.pattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 处理器接口
 * Created by Administrator on 2017/12/23.
 */
public class StarHandler implements InvocationHandler {

    private Star realStar;

    public StarHandler(Star realStar) {
        this.realStar = realStar;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("面谈，签合同，订票");
        if("sing".equals(method.getName())){
            method.invoke(realStar, args);
        }
        System.out.println("收钱");
        return null;
    }

}
