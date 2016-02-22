package org.oneclicklabs.task.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.ApplicationContext;

/**
 * Created by karthy on 1/25/16.
 */
@SpringApplicationConfiguration
public class Application {

    public static void main(String args[]){

        ApplicationContext context = SpringApplication.run(Application.class,args[]);

        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }    }
}
