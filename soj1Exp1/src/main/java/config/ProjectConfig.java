package config;

import Objects.Cat;
import org.springframework.context.annotation.*;
import repositories.TransactionRepository;
import services.TransactionService;

@Configuration
@ComponentScan(basePackages={"repositories","services"})
//@ComponentScans({"Repositories"}) TODO:ComponentScans() + @Autowired
public class ProjectConfig {

    @Bean
    @Scope("prototype")
    public Cat cat(){
        Cat c = new Cat();
        c.name = "Tom";
        return c;
    }

    @Bean
    public TransactionRepository transactionRepository(){
        TransactionRepository transactionRepository = new TransactionRepository();
        transactionRepository.var = "value";
        return transactionRepository;
    }
    @Bean
    @Primary
    @Scope("prototype")
    public TransactionRepository transactionRepository2(){
        TransactionRepository transactionRepository = new TransactionRepository();
        transactionRepository.var = "value2";
        return transactionRepository;
    }

    @Bean
    public TransactionService transactionService(){
        TransactionService transactionService = new TransactionService();
        transactionService.transactionRepository = transactionRepository();
        return transactionService;
    }

}
