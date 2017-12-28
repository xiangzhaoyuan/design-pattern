package com.xzy.pattern.facade;

/**
 * 测试不使用外观模式
 * Created by Administrator on 2017/12/28.
 */
public class Client1 {

    public static void main(String[] args) {
        IndustrialAndCommercialBureau iacb = new ChaoYangIndustrialAndCommercialBureau();
        iacb.checkName();
        QualityInspectionAgency qia = new ChaoYangQualityInspectionAgency();
        qia.orgCodeCertificate();
        TaxBureau tb = new ChaoYangTaxBureau();
        tb.taxCertificate();
        Bank bank = new ICBC();
        bank.openAccount();
    }

}
