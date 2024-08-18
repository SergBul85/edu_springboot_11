package com.hstn.aop.dao;

import com.hstn.aop.Admin;

import java.util.List;

public interface AdminDAO {

    void addAdmin();

    String getName();

    void setName(String name);

    String getPassword();

    void setPassword(String password);

    List<Admin> findAdmins();

    List<Admin> findAdmins(boolean flag);

}
