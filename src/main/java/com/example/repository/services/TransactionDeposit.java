package com.example.repository.services;

import com.example.repository.data.TransactionRepository;
import com.example.repository.entity.Account;
import com.example.repository.entity.Transaction;
import org.springframework.stereotype.Component;

@Component
public class TransactionDeposit {
    private AccountDepositService accountDepositService;

    public TransactionDeposit(AccountDepositService accountDepositService, TransactionRepository transactionRepository) {
        this.accountDepositService = accountDepositService;
    }

    public void execute(Account accountDeposit, double amount) {
        accountDepositService.deposit(amount, accountDeposit);
    }
}
