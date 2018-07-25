package com.oocl.employeeapi;

import com.oocl.employeeapi.domain.Company;
import com.oocl.employeeapi.domain.Employees;
import com.oocl.employeeapi.service.CompanyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class CompanyServiceTest {

    @Test
    public void should_return_companyList_when_get_all_companies() {

        CompanyService companyService = new CompanyService();
        Employees employee1 = new Employees(1,"jasok",20,"male",3244);
        Employees employee2 = new Employees(2,"mike",21,"female",4554);
        List<Employees> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        companyService.companiesList.add(new Company("dab",23,employees));
        companyService.companiesList.add(new Company("ocelai",32,employees));

        assertThat(companyService.getCompaniesList(), is(companyService.companiesList));
    }

    @Test
    public void should_return_the_special_employees_when_get_a_special_number() {

        //give
        List<Company> companys=new ArrayList<>();
        List<Employees> employees=new ArrayList<>();
        employees.add(new Employees(1,"jasok",20,"male",3244));
        Company except=new Company("OOCL",1,employees);
        companys.add(except);

        //when
        CompanyService service=new CompanyService();
        service.addCompaniesList(except);
        List<Employees> result=service.getByNumberEmployeesList(1);
        //then
        assertThat(result,is(employees));
    }



    @Test
    public void should_return_one_company_when_add_company() {

        //give
        List<Company> companys=new ArrayList<>();
        List<Employees> employees=new ArrayList<>();
        employees.add(new Employees(1,"jasok",20,"male",3244));
        Company except=new Company("OOCL",1,employees);
        companys.add(except);

        //when
        CompanyService service=new CompanyService();
         //then
        assertThat(service.addCompaniesList(except),is(companys));
    }

    @Test
    public void should_show_correct_property_of_company_after_update() {

        //give
        List<Company> companys=new ArrayList<>();
        List<Employees> employees=new ArrayList<>();
        List<Employees> employees2=new ArrayList<>();
        employees.add(new Employees(1,"jasok",20,"male",3244));
        employees2.add(new Employees(1,"mike",19,"male",5000));
        Company except=new Company("OOCL",1,employees);
        Company except2=new Company("魅族",1,employees2);
        companys.add(except);

        //when
        CompanyService service=new CompanyService();
        service.addCompaniesList(except);
        //then
        assertThat(service.updateCompany(1,except2).contains(except2),is(true));
        assertThat(service.updateCompany(1,except2).contains(except),is(false));
    }

    @Test
    public void should_return_one_company_when_delete_company_by_number() {

        //give
        List<Employees> employees=new ArrayList<>();
        employees.add(new Employees(1,"jasok",20,"male",3244));
        Company except=new Company("OOCL",1,employees);

        //when
        CompanyService service=new CompanyService();
        service.addCompaniesList(except);
        //then
        assertThat(service.deleteCompany(1).contains(except),is(false));
    }
}