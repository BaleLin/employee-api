package com.oocl.employeeapi.control;
import com.oocl.employeeapi.domain.Employees;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeesController {
    private List<Employees> all = new ArrayList<>();
    @GetMapping("/employees")
    public List<Employees> getAllEmployees(){
        return all;
    }
//
//    @GetMapping("/employees/{id}")
//    public List<Employees> getByIdEmployees(){
//        return all;
//    }
//    @PostMapping("/addEmployees")
//    public void addEmployees( Employees employees){
//        try{
//            all.add(employees);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//    }
}
