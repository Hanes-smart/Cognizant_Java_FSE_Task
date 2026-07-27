package com.abishek.accountservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abishek.accountservice.model.Account;
import com.abishek.accountservice.service.AccountService;

@RestController
public class AccountController {

    @Autowired
    private AccountService service;

    @GetMapping("/account")
    public Account getAccount() {
        return service.getAccount();
    }

}