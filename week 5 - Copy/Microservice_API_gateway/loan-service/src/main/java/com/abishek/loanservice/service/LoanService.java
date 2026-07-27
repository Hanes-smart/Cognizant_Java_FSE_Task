package com.abishek.loanservice.service;

import org.springframework.stereotype.Service;

import com.abishek.loanservice.model.Loan;

@Service
public class LoanService {

    public Loan getLoan() {
        return new Loan(1001, "Home Loan", 2500000);
    }

}