package com.hstn.aop.dao;

import com.hstn.aop.Admin;

public interface AdminDAO {

    void addAdmin();

    String getName();

    void setName(String name);

    String getPassword();

    void setPassword(String password);


}
