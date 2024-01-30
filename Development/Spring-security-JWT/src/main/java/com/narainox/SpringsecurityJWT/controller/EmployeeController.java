package com.narainox.SpringsecurityJWT.controller;

import com.narainox.SpringsecurityJWT.model.Employee;
import com.narainox.SpringsecurityJWT.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/welcome")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/home")
    public List<Employee> getEmployee()
    {
        log.info("Get Employee List.");
        return employeeService.getEmployees();
    }
}
