package com.example.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.repository.EmployeeRepository;
import com.example.employee.models.Employee;


@Service
public class EmployeeService {
    
    @Autowired
    EmployeeRepository employeeRepository;

     public List<Employee> findAll() {
        return employeeRepository.findAll();
     }

     public Employee save(Employee employee) {
        return employeeRepository.save(employee);
     }

     

}
