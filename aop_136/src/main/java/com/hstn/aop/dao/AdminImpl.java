package com.hstn.aop.dao;

import com.hstn.aop.Admin;
import org.springframework.stereotype.Repository;

@Repository
public class AdminImpl implements AdminDAO {
    @Override
    public void addAdmin() {
        System.out.println("222222222222222222222222");
        System.out.println(getClass() + ": add user data form ADMIN");
    }
}
