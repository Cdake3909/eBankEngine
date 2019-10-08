package com.example.eBankEngine.pay.service;

import com.alibaba.fastjson.JSONObject;

public class AliBaBaService extends  BasePayService{
    @Override
    public String pay(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("responseCode","0000");
        jsonObject.put("responseMsg","支付宝支付成功");
        return jsonObject.toJSONString();
    }
}
