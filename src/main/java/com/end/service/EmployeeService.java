package com.end.service;

import com.end.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee add(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployee(int id);
}
