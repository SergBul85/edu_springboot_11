package com.hstn.aop.dao;

import com.hstn.aop.Admin;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<Admin> findAdmins() {
        List<Admin> admins = new ArrayList<>();
        admins.add(new Admin("Anna", 18));
        admins.add(new Admin("Boris", 25));
        admins.add(new Admin("Vova", 30));
        return admins;
    }
}
