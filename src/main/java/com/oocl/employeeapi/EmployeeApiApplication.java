package com.oocl.employeeapi;

import com.oocl.employeeapi.domain.Employees;
import com.oocl.employeeapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class EmployeeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApiApplication.class, args);
	}
}
