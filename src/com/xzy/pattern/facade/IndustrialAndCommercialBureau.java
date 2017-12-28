package com.xzy.pattern.facade;

/**
 * 工商局
 * Created by Administrator on 2017/12/28.
 */
public interface IndustrialAndCommercialBureau {
    void checkName();
}

class ChaoYangIndustrialAndCommercialBureau implements IndustrialAndCommercialBureau{

    @Override
    public void checkName() {
        System.out.println("在朝阳区工商局检查名字是否冲突");
    }
}