package services;

import model.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.BankAccountRepository;

@Service
public class BankAccountService {

    @Autowired
    public BankAccountRepository bar;

    public void addBankAccount(BankAccount ba){
        bar.insertBankAccount(ba);
    }

    public void transferMoney(String fromIBAN, String toIBAN, double amount){
        BankAccount fromBankAccount = bar.getBankAccount(fromIBAN);
        BankAccount toBankAccount = bar.getBankAccount(toIBAN);
        if(fromBankAccount != null && toBankAccount != null){
            fromBankAccount.balance = fromBankAccount.balance - amount;
            toBankAccount.balance = toBankAccount.balance + amount;
        }
    }

}
