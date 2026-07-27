package com.abishek.accountservice.service;

import org.springframework.stereotype.Service;

import com.abishek.accountservice.model.Account;

@Service
public class AccountService {

    public Account getAccount() {
        return new Account(101, "Abishek", 50000);
    }

}