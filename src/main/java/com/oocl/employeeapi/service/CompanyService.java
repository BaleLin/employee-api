package com.oocl.employeeapi.service;

import com.oocl.employeeapi.domain.Company;
import com.oocl.employeeapi.domain.Employees;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
@Service
public class CompanyService {
    List<Company> companiesList = new ArrayList<>();
    List<Employees> employeesList = new ArrayList<>();
    public List<Company> getCompaniesList(){
//        employeesList.add(new Employees(1,"lisi",24,"dasda"));
//        companiesList.add(new Company("oocl",1,employeesList));
        return companiesList;
    }

    public List<Company> addCompaniesList(Company company){
        companiesList.add(company);
        return companiesList;
    }
}
