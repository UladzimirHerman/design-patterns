package com.gmail.herman.uladzimir.behavior.strategy.tax.profile;

import java.math.BigDecimal;

public class Person {

    private int age;
    private int children;
    private BigDecimal salary;

    public Person(int age, int children, BigDecimal salary) {
        this.age = age;
        this.children = children;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

}
