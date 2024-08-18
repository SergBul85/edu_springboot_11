package com.hstn.aop.dao;

import com.hstn.aop.Admin;
import org.springframework.stereotype.Repository;

@Repository
public class AdminImpl implements AdminDAO {
    @Override
    public int addAdmin(Admin admin, int number, boolean flag) {
        System.out.println("222222222222222222222222");
        System.out.println(getClass() + ": add user data form ADMIN");
        return 1;
    }
}
