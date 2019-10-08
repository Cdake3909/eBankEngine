package com.example.eBankEngine.pay.service;

import com.alibaba.fastjson.JSONObject;

public class DefaultPayService extends  BasePayService{
    @Override
    public String pay() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("responseCode","9999");
        jsonObject.put("responseMsg","请选择一种支付方式支付");
        return jsonObject.toJSONString();
    }
}
