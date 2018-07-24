package com.oocl.employeeapi.domain;

import java.util.List;

public class Company {
    private String name;
    private int employeesNumber;
    List <Employees> employeesList;

    public Company(String name, int employeesNumber, List<Employees> employeesList) {
        this.name = name;
        this.employeesNumber = employeesNumber;
        this.employeesList = employeesList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(int employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    public List<Employees> getEmployeesList() {
        return employeesList;
    }

    public void setEmployeesList(List<Employees> employeesList) {
        this.employeesList = employeesList;
    }
}
