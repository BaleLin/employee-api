package com.oocl.employeeapi;

import com.oocl.employeeapi.domain.Employees;
import com.oocl.employeeapi.service.EmployeeService;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class EmployeeServiceTest {

    private List<Employees> employees = new ArrayList<>();



    @Test
    public void should_return_list_when_call_find_all_employee() {
        EmployeeService employeeService = new EmployeeService();
        Employees employees = new Employees(1, "jason", 20, "female",6000);
        assertThat(employeeService.addEmployees(employees).contains(employees),is(true));
    }
}
