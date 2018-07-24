package com.oocl.employeeapi.control;
import com.oocl.employeeapi.domain.Employees;
import com.oocl.employeeapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class EmployeesController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/employees")
    public List<Employees> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employees getByIdEmployees(@PathVariable int id){
        return employeeService.getByIdEmployees(id);
    }
@PostMapping(path = "/employee")
public List<Employees> addEmployee(@RequestBody Map<String ,Object> request) {
    int id = (int) request.get("id");
    String name= (String) request.get("name");
    int age = (int) request.get("age");
    String gender = (String) request.get("gender");
    Employees employee = new Employees(id,name,age,gender);
    return employeeService.addEmployees(employee);
}
}
