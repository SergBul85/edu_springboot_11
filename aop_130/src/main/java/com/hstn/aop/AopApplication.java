package com.hstn.aop;

import com.hstn.aop.dao.UserDataDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AopApplication {

    public static void main(String[] args) {
        SpringApplication.run(AopApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(UserDataDAO userDataDAO) {
        return runner -> {
            demoTheBeforeAdvice(userDataDAO);
        };
    }

    private void demoTheBeforeAdvice(UserDataDAO userDataDAO) {
        userDataDAO.addUserData();
    }


}
