package com.hstn.aop.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class CreditServiceImpl implements BankService{
    @Override
    public String getCredit() {

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return "Credit was APPROVED.";
    }
}
