package main;

import model.BankAccount;
import repositories.BankAccountRepository;
import repositories.TransactionRepository;
import services.BankAccountService;
import services.TransactionService;
import config.ProjectConfig;
import Objects.Cat;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public  static void main(String[] args){

        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class)){
            Cat c = context.getBean(Cat.class);
            //System.out.println(c);

            Cat c2 = context.getBean(Cat.class);
            //System.out.println(c2);

            TransactionRepository tr2 = context.getBean("transactionRepository",TransactionRepository.class);
            System.out.println(tr2);//singleton

            TransactionRepository tr2_v2 = context.getBean("transactionRepository",TransactionRepository.class);
            System.out.println(tr2_v2);//singleton

            TransactionRepository tr = context.getBean(TransactionRepository.class);
            System.out.println(tr);//primary, prototype

            TransactionRepository tr4 = context.getBean("transactionRepository2",TransactionRepository.class);
            System.out.println(tr4);//primary, prototype

            TransactionRepository tr3 = context.getBean("transactionRepository2",TransactionRepository.class);
            System.out.println(tr3.var);//primary, prototype

            TransactionService ts = context.getBean(TransactionService.class);
            System.out.println(ts);


            BankAccount ba1 = new BankAccount();
            ba1.IBAN = "1";
            ba1.Nume = "OANA SO";
            ba1.balance = 1000000;

            BankAccount ba2 = new BankAccount();
            ba2.IBAN = "2";
            ba2.Nume = "tu";
            ba2.balance = 200;

            BankAccountService bankAccountService = context.getBean(BankAccountService.class);
            bankAccountService.addBankAccount(ba1);
            bankAccountService.addBankAccount(ba2);
            System.out.println(ba1.balance);
            System.out.println(ba2.balance);
            bankAccountService.transferMoney("1","2",200);
            System.out.println(ba1.balance);
            System.out.println(ba2.balance);

        }
    }
}
