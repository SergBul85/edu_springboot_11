package com.hstn.aop;

import com.hstn.aop.dao.AdminDAO;
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
    public CommandLineRunner commandLineRunner(UserDataDAO userDataDAO, AdminDAO adminDAO) {
        return runner -> {
            demoTheBeforeAdvice(userDataDAO, adminDAO);
        };
    }

    private void demoTheBeforeAdvice(UserDataDAO userDataDAO, AdminDAO adminDAO) {

        userDataDAO.addUserData();

        adminDAO.addAdmin();

        adminDAO.setName("Anna");
        adminDAO.setPassword("12345678");

        String name = adminDAO.getName();
        String password = adminDAO.getPassword();


    }


}
