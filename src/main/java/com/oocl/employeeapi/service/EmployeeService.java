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

    public List<Employees> getAllEmployees(){
        all.add(new Employees(1,"lisis",20,"aa",5000));
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

}
