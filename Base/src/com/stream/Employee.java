package com.stream;

public class Employee {
    private String name;
    private String sex;
    private int salary;
    private int bonus;
    private String chufa;

    public Employee() {
    }

    public Employee(String name, String sex, int salary, int bonus, String chufa) {
        this.name = name;
        this.sex = sex;
        this.salary = salary;
        this.bonus = bonus;
        this.chufa = chufa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public String getChufa() {
        return chufa;
    }

    public void setChufa(String chufa) {
        this.chufa = chufa;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", chufa='" + chufa + '\'' +
                '}';
    }
}
