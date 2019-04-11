package repositories;

import model.BankAccount;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BankAccountRepository {

   public List<BankAccount> list = new ArrayList<>();

   public void insertBankAccount(BankAccount ba){
       list.add(ba);
   }

   public ArrayList<BankAccount> getAllBankAccounts(){
       return (ArrayList<BankAccount>) list;
   }

   public BankAccount getBankAccount(String IBAN){
       for(BankAccount ba :list){
           if(ba.IBAN.equals(IBAN)){
               return ba;
           }
       }
       return null;
   }

}
