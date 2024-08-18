package com.hstn.aop;

import com.hstn.aop.dao.AdminDAO;
import com.hstn.aop.dao.UserDataDAO;
import com.hstn.aop.service.BankService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class AopApplication {

    private final com.hstn.aop.aspect.Admin admin;

    public AopApplication(com.hstn.aop.aspect.Admin admin) {
        this.admin = admin;
    }

    public static void main(String[] args) {
        SpringApplication.run(AopApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(UserDataDAO userDataDAO,
                                               AdminDAO adminDAO,
                                               BankService bankService) {
        return runner -> {

//            demoTheBeforeAdvice(userDataDAO, adminDAO);
//            runAfterAfterReturningAdvice(adminDAO);
//            runAfterThrowingAdvice(adminDAO);
//            runAfterAdvice(adminDAO);

            runAroundAdvice(bankService);

        };
    }

    private void runAroundAdvice(BankService bankService) {
        System.out.println("Main program START");

        String message = bankService.getCredit();
        System.out.println("The decision: " + message);

        System.out.println("Main program END");
    }

    private void runAfterAdvice(AdminDAO adminDAO) {
        List<Admin> admins = null;
        try {
            boolean flag = false;
            admins = adminDAO.findAdmins(flag);
        } catch (Exception e) {
            System.out.println("Exception in main: " + e.getMessage());
        }
        System.out.println("No exception in main: ");
    }

    private void runAfterThrowingAdvice(AdminDAO adminDAO) {

        List<Admin> admins = null;
        try {
            boolean flag = true;
            admins = adminDAO.findAdmins(flag);
        } catch (Exception e) {
            System.out.println("Exception in main: " + e.getMessage());
        }

    }

    private void runAfterAfterReturningAdvice(AdminDAO adminDAO) {
        List<Admin> admins = adminDAO.findAdmins();
        for (Admin admin : admins) {
            System.out.println(admin);
        }

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
