package com.xzy.pattern.facade;

/**
 * 质检局
 * Created by Administrator on 2017/12/28.
 */
public interface QualityInspectionAgency {
    void orgCodeCertificate();
}

class ChaoYangQualityInspectionAgency implements QualityInspectionAgency{

    @Override
    public void orgCodeCertificate() {
        System.out.println("在朝阳区质检局办理组织机构代码证");
    }
}