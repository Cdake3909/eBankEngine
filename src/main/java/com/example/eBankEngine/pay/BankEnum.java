package com.example.eBankEngine.pay;

public enum BankEnum {
    ALIBABA("a"),WECHAT("w"),UNKNOW("unknown");
    /**银行编号 */
    private String bankNo;
    BankEnum(String bankNo) {
        this.bankNo = bankNo;
    }

    public String getBankNo() {
        return bankNo;
    }
}
