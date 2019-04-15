package com.example.demo.repositories;

import com.example.demo.model.BankAccount;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BankAccountRepository {

    List<BankAccount> list = new ArrayList<BankAccount>();

    public void addBankAccount(BankAccount bankAccount){
        list.add(bankAccount);
    }

    public List<BankAccount> getBankAccounts(){
        return list;
    }


}
