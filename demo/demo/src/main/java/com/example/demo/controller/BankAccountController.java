package com.example.demo.controller;

import com.example.demo.model.BankAccount;
import com.example.demo.services.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class BankAccountController {

    @Autowired
    private BankAccountService bankAccountService;
    @PostMapping(path="/add/account")
    public void addBAnkAccount(@RequestBody BankAccount bankAccount, HttpServletResponse response){
        bankAccountService.addBAnkAccount(bankAccount,response);


    }

}
