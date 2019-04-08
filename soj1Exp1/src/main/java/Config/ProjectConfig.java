package Config;

import Objects.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ProjectConfig {

    @Bean
    @Scope("prototype")
    public Cat cat(){
        Cat c = new Cat();
        c.name = "Tom";
        return c;
    }

}
