package com.narainox.SpringsecurityJWT.service;

import com.narainox.SpringsecurityJWT.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    private List<Employee> employees=new ArrayList<>();

    public EmployeeService() {
        employees.add(new Employee(UUID.randomUUID().toString(),"Ayush","ayush@gmail.com"));
        employees.add(new Employee(UUID.randomUUID().toString(),"Abhay","abhay@gmail.com"));
        employees.add(new Employee(UUID.randomUUID().toString(),"Avedika","avedika@gmail.com"));
        employees.add(new Employee(UUID.randomUUID().toString(),"Aditi","aditi@gmail.com"));
    }

    public List<Employee> getEmployees()
    {
        return employees;
    }
}
