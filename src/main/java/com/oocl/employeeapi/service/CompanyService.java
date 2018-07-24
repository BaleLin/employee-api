package com.oocl.employeeapi.service;

import com.oocl.employeeapi.domain.Company;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
@Service
public class CompanyService {
    List<Company> companiesList = new ArrayList<>();

    public List<Company> getCompaniesList(){
        return companiesList;
    }
}
