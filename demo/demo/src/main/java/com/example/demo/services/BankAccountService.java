package com.example.demo.services;

import com.example.demo.model.BankAccount;
import com.example.demo.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;

@Service
public class BankAccountService {

    private BankAccountRepository bankAccountRepository;

    @Autowired
    public BankAccountService(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }

    public void addBAnkAccount(BankAccount account, HttpServletResponse response){

        if(account.balance>50){
            bankAccountRepository.addBankAccount(account);
        }else{
            response.setStatus(403);
        }
    }
}
