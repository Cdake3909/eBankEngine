package com.example.eBankEngine.util;
import com.example.eBankEngine.pay.model.BankInfo;
import com.example.eBankEngine.service.BankInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class BankUtil {


    private static BankInfoService bankInfoService;
    public  static Map<String,String> bankInfoMap = null;


    @Autowired
    public  void setBankInfoService(BankInfoService bankInfoService) {
        BankUtil.bankInfoService = bankInfoService;
    }

    public static Map<String,String> getAllBanks(){
        if(bankInfoMap==null){
            bankInfoMap = new HashMap<String, String>();
            for (BankInfo bankInfo:bankInfoService.getAllBanks()) {
                bankInfoMap.put(bankInfo.getBankNo(),bankInfo.getPayCompany());
            };
        }
        return bankInfoMap;
    }


}
