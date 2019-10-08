package com.example.eBankEngine.service;

import com.example.eBankEngine.dao.BankInfoDao;
import com.example.eBankEngine.pay.model.BankInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankInfoService {
    @Autowired
    private BankInfoDao bankInfoDao;
    public List<BankInfo> getAllBanks(){
          List list =bankInfoDao.getAllBanks();
          return list;
    }
}
