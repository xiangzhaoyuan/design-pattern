package com.xzy.pattern.facade;

/**
 * 税务局
 * Created by Administrator on 2017/12/28.
 */
public interface TaxBureau {
    void taxCertificate();
}

class ChaoYangTaxBureau implements  TaxBureau{

    @Override
    public void taxCertificate() {
        System.out.println("在朝阳区税务局办理税务登记证");
    }
}