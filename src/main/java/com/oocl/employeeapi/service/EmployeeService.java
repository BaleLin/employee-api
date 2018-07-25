package com.oocl.employeeapi.service;

import com.oocl.employeeapi.domain.Employees;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    private List<Employees> all = new ArrayList<>();
    {
        all.add(new Employees(1,"jkson",20,"male",5000));
        all.add(new Employees(2,"mike",23,"female",5000));
    }
    public List<Employees> getAllEmployees(){
       return all;
    }


    public List<Employees> getByGenderEmployees(){
        return all.stream().filter(employee -> employee.getGender() .equals("male") ).collect(Collectors.toList());
    }

    public List<Employees> addEmployees( Employees employees){
         all.add(employees);
        return all;

    }

    public List<Employees> updateEmployee(int id,Employees employees){
        for(int i=0;i<all.size();i++){
            if (all.get(i).getId()==id){
                all.set(i,new Employees(id,employees.getName(),employees.getAge(),employees.getGender(),employees.getSalary()));
            }
        }
        return all;
    }
    public List<Employees> deleteEmployee(int id){
        for(int i=0;i<all.size();i++){
            if (all.get(i).getId()==id){
                all.remove(new Employees(id));
            }
        }
        return all;
    }
    public List<Employees> getEmployeesByPage(int page, int pageSize) {
        List<Employees> result = new ArrayList<>();
        int start = (page-1)*pageSize;
        int end = (start+pageSize)>all.size() ? all.size() : (start+pageSize);
        for(int i=start;i<end;i++){
            result.add(all.get(i));
        }
        return result;
    }
}
