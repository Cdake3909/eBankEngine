package com.example.eBankEngine.pay.model;

public class BankInfo {
    /**银行编号*/
    private String bankNo;
    /**支付机构代号*/
    private String payCompany;

    public BankInfo(String bankNo, String payCompany) {
        this.bankNo = bankNo;
        this.payCompany = payCompany;
    }

    public String getBankNo() {
        return bankNo;
    }

    public String getPayCompany() {
        return payCompany;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    public void setPayCompany(String payCompany) {
        this.payCompany = payCompany;
    }

    @Override
    public String toString() {
        return "BankInfo{" +
                "bankNo='" + bankNo + '\'' +
                ", payCompany='" + payCompany + '\'' +
                '}';
    }
}
