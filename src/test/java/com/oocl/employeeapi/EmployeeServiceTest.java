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

    @Test
    public void should_return_list_when_call_add_and_find_all_employee() {
        EmployeeService employeeService = new EmployeeService();
        Employees employees = new Employees(1, "jason", 20, "female",6000);
        assertThat(employeeService.addEmployees(employees).contains(employees),is(true));
    }

    @Test
    public void should_return_update_list_when_call_update_employee() {
        EmployeeService employeeService = new EmployeeService();
        Employees employees = new Employees(1, "jason", 20, "female",6000);
        Employees newEmployees = new Employees(1, "jason", 20, "female",5000);
        assertThat(employeeService.updateEmployee(1,newEmployees).contains(employees),is(false));
    }

    @Test
    public void should_return_the_id_employee_list_when_give_a_man_find() {
        EmployeeService employeeService = new EmployeeService();
        Employees employees = new Employees(1, "jason", 20, "female",6000);
        Employees employees2 = new Employees(2, "mike", 21, "female",5000);
        Employees employees3 = new Employees(3, "jhon", 20, "male",6000);
        employeeService.addEmployees(employees);
        employeeService.addEmployees(employees2);
        employeeService.addEmployees(employees3);
        assertThat(employeeService.getByGenderEmployees().contains(employees),is(false));
        assertThat(employeeService.getByGenderEmployees().contains(employees2),is(false));
        assertThat(employeeService.getByGenderEmployees().contains(employees3),is(true));
    }

    @Test
    public void should_delete_the_id_employee_list_when_give_a_id_to_delete() {
        EmployeeService employeeService = new EmployeeService();
        Employees employees = new Employees(1, "jason", 20, "female",6000);
        Employees employees2 = new Employees(2, "mike", 21, "female",5000);
        employeeService.addEmployees(employees);
        employeeService.addEmployees(employees2);
        assertThat(employeeService.deleteEmployee(1).contains(employees),is(false));

    }
    @Test
    public void should_paging_the_employee_list_successful_when_give_a_2_2() {
        EmployeeService employeeService = new EmployeeService();
        Employees employees = new Employees(1, "jason", 20, "female",6000);
        Employees employees2 = new Employees(2, "mike", 21, "female",5000);
        Employees employees3 = new Employees(3, "sjason", 20, "female",6000);
        Employees employees4 = new Employees(4, "smike", 21, "female",5000);
        employeeService.addEmployees(employees);
        employeeService.addEmployees(employees2);
        employeeService.addEmployees(employees3);
        employeeService.addEmployees(employees4);
        assertThat(employeeService.getEmployeesByPage(2,2).contains(employees),is(false));
        assertThat(employeeService.getEmployeesByPage(2,2).contains(employees2),is(false));
        assertThat(employeeService.getEmployeesByPage(2,2).contains(employees3),is(true));
        assertThat(employeeService.getEmployeesByPage(2,2).contains(employees4),is(true));

    }


}
