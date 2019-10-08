package com.example.eBankEngine.pay.factory;
import com.example.eBankEngine.pay.service.AliBaBaService;
import com.example.eBankEngine.pay.service.BasePayService;
import com.example.eBankEngine.pay.BankEnum;
import com.example.eBankEngine.pay.service.DefaultPayService;

public class PayFactory {
    private static BasePayService aliBaBaService = new AliBaBaService();
    private static BasePayService defaultPayService = new DefaultPayService();
    public static BasePayService getService(String payCompany){
        BankEnum enumBankNo;
        try{
            enumBankNo= BankEnum.valueOf(payCompany);
        }catch (Exception e){
            enumBankNo = BankEnum.UNKNOW;
        }

        switch (enumBankNo){
            case ALIBABA:
                return aliBaBaService;
            default:
                return defaultPayService;
        }
    }


}
