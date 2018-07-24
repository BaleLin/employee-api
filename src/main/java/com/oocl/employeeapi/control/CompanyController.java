package com.oocl.employeeapi.control;

import com.oocl.employeeapi.domain.Company;
import com.oocl.employeeapi.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @GetMapping("/companies")
    public List<Company> getAllCompany(){
       return companyService.getCompaniesList();
    }
}
