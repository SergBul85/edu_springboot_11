package com.hstn.aop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class AdminImpl implements AdminDAO {

    private String name;

    private String password;

    @Override
    public void addAdmin() {
        System.out.println(getClass() + ": add user data form ADMIN");
    }

    public String getName() {
        System.out.println(getClass() + ": get name method");
        return name;
    }

    public void setName(String name) {
        System.out.println(getClass() + ": set name method");
        this.name = name;
    }

    public String getPassword() {
        System.out.println(getClass() + ": get password method");
        return password;
    }

    public void setPassword(String password) {
        System.out.println(getClass() + ": set password method");
        this.password = password;
    }
}
