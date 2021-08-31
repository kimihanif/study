package com.sabre.study.domain;

public class Employee {
    private String name;
    private Integer age;
    private String role;

    public Employee(String name, Integer age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
