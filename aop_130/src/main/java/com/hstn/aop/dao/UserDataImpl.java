package com.hstn.aop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDataImpl implements UserDataDAO {

    @Override
    public void addUserData() {
        System.out.println("222222222222222222222222");
        System.out.println(getClass() + ": add user data");

    }
}
