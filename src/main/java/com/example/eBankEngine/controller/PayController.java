package com.example.eBankEngine.controller;

import com.example.eBankEngine.dao.BankInfoDao;
import com.example.eBankEngine.pay.factory.PayFactory;
import com.example.eBankEngine.service.BankInfoService;
import com.example.eBankEngine.util.BankUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayController {
    @RequestMapping("/pay")
    public String pay(@RequestParam(value="sno")String sno){
        String bankNo="a01";
        return PayFactory.getService(BankUtil.getAllBanks().get(bankNo)).pay();
    }
}
