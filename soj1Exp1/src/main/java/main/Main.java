package main;

import Config.ProjectConfig;
import Objects.Cat;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public  static void main(String[] args){

        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class)){
            Cat c = context.getBean(Cat.class);
            System.out.println(c);

            Cat c2 = context.getBean(Cat.class);
            System.out.println(c2);
        }
    }
}
