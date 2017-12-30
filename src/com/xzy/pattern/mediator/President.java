package com.xzy.pattern.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * 具体中介者对象ConcreteMediator
 * Created by Administrator on 2017/12/30.
 */
public class President implements Mediator {

    private Map<String,Department> map = new HashMap<String, Department>();

    @Override
    public void register(String dname, Department department) {
        map.put(dname,department);
    }

    @Override
    public void command(String dname) {
        map.get(dname).selfAction();
    }
}
