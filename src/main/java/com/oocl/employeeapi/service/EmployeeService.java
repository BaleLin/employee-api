package com.oocl.employeeapi.service;

import com.oocl.employeeapi.domain.Employees;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeService {
    private List<Employees> all = new ArrayList<>();
    public List<Employees> getAllEmployees(){
        all.add(new Employees(1,"limi",24,"sds"));
        all.add(new Employees(2,"limi",24,"sds"));
        return all;
    }


    public Employees getByIdEmployees(int id){
        for(int i=0;i<all.size();i++){
            if (all.get(i).getId()==id){
               return all.get(i);
            }
        }
        return new Employees();
    }

    public List<Employees> addEmployees( Employees employees){
         all.add(employees);
        return all;

    }
}
