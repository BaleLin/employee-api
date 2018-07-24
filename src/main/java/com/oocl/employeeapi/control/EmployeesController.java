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
    public List<Employees> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/male")
    public List<Employees> getByGenderEmployees(){
        return employeeService.getByGenderEmployees();
    }

    @PostMapping(path = "/employees")
    public List<Employees> addEmployee(@RequestBody Employees employees) {
        return employeeService.addEmployees(employees);
    }
    @PutMapping(("/employees/{id}"))
    public List<Employees> updateEmployee(@PathVariable Integer id, @RequestBody Employees employee) {

        return employeeService.updateEmployee(id, employee);

    }
    @DeleteMapping(("/employees/{id}"))
    public List<Employees> deleteEmployee(@PathVariable Integer id) {

        return employeeService.deleteEmployee(id);
    }
    @GetMapping("/employees/page/{page}/pageSize/{pageSize}")
    public List<Employees> getEmployeesByPage(@PathVariable int page,@PathVariable int pageSize){
        return  employeeService.getEmployeesByPage(page,pageSize);
    }

}
