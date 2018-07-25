package com.oocl.employeeapi.control;

import com.oocl.employeeapi.domain.Company;
import com.oocl.employeeapi.domain.Employees;
import com.oocl.employeeapi.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @GetMapping("/companies")
    public List<Company> getAllCompany(){
       return companyService.getCompaniesList();
    }

    @GetMapping("/companies/{number}/employees")
    public List<Employees> getByNumberEmployeesList(@PathVariable int number){
        return companyService.getByNumberEmployeesList(number);
    }
    @PostMapping("/companies")
    public List<Company> addCompany(@RequestBody Company company){
        return companyService.addCompaniesList(company);
    }

    @PutMapping("/companies/{number}")
    public List<Company> updateCompany(@PathVariable int number,@RequestBody Company company){
        return companyService.updateCompany(number,company);
    }

    @DeleteMapping("/companies/{number}")
    public List<Company> deleteCompany(@PathVariable int number){
        return companyService.deleteCompany(number);
    }

    @GetMapping("/companies/page/{page}/pageSize/{pageSize}")
    public List<Company> getCompanyByPage(@PathVariable int page, @PathVariable int pageSize) {
        return companyService.getCompanyByPage(2,2);
    }

}
