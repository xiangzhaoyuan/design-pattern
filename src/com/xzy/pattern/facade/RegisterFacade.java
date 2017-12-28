package com.xzy.pattern.facade;

/**
 * 办理注册公司的门面对象
 * Created by Administrator on 2017/12/28.
 */
public class RegisterFacade {

    public void register(){
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
