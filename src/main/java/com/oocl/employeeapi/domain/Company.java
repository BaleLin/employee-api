package com.oocl.employeeapi.domain;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Company {
    private String companyName;
    private int employeesNumber;
    List <Employees> employeesList;

    public Company() {
    }

    public Company(String companyName, int employeesNumber, List<Employees> employeesList) {
        this.companyName = companyName;
        this.employeesNumber = employeesNumber;
        this.employeesList = employeesList;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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
