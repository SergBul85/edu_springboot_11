package com.hstn.aop;

public class Admin {

    private String name;

    private int age;

    public Admin() {
    }

    public Admin(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Admin{" +
               "name='" + name + '\'' +
               ", age=" + age +
               '}';
    }
}
