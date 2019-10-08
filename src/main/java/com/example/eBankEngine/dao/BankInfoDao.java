package com.example.eBankEngine.dao;


import com.example.eBankEngine.pay.model.BankInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
@Mapper
public interface BankInfoDao {
   public String getBankIdByBankNo(@Param("bankNo")  String bankNo);
   /**获取全部的银行编号+公司名称*/
   public List<BankInfo> getAllBanks();

}
