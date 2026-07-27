package com.abishek.loanservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abishek.loanservice.model.Loan;
import com.abishek.loanservice.service.LoanService;

@RestController
public class LoanController {

    @Autowired
    private LoanService service;

    @GetMapping("/loan")
    public Loan getLoan() {
        return service.getLoan();
    }

}