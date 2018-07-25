package com.oocl.employeeapi.service;

import com.oocl.employeeapi.domain.Company;
import com.oocl.employeeapi.domain.Employees;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
@Service
public class CompanyService {
    public List<Company> companiesList = new ArrayList<>();
    {
        List<Employees> employeesList = new ArrayList<>();
        List<Employees> employeesList2 = new ArrayList<>();
        employeesList.add(new Employees(1,"李明",22,"male",5000));
        employeesList.add(new Employees(2,"李四",24,"female",6000));
        employeesList2.add(new Employees(1,"郭思",25,"male",5000));
        employeesList2.add(new Employees(2,"张怀",28,"female",6000));
        companiesList.add(new Company("oocl",2,employeesList));
        companiesList.add(new Company("魅族",2,employeesList2));
    }
    public List<Company> getCompaniesList(){
       return companiesList;
    }

    public List<Company> addCompaniesList(Company company){
        companiesList.add(company);
        return companiesList;
    }
    //查询指定的员工列表
    public List<Employees> getByNumberEmployeesList(int number){
        return companiesList.get(number-1).getEmployeesList();

    }
    public List<Company> updateCompany(int number,Company company){
       companiesList.set(number-1,company);
       return companiesList;
    }
    public List<Company> deleteCompany(int number){
        companiesList.remove(number-1);
        return companiesList;
    }
    public List<Company> getCompanyByPage(int page, int pageSize) {
        List<Company> result = new ArrayList<>();
        int start = (page-1)*pageSize;
        int end = (start+pageSize)>companiesList.size() ? companiesList.size() : (start+pageSize);
        for(int i=start;i<end;i++){
            result.add(companiesList.get(i));
        }
        return result;
    }
}
