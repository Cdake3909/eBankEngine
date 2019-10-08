package com.example.eBankEngine;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.example.eBankEngine.dao")
public class EBankEngineApplication {
    public static void main(String[] args) {
        SpringApplication.run(EBankEngineApplication.class, args);
    }
}
