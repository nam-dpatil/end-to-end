package com.end.service.impl;

import com.end.model.Employee;
import com.end.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    List<Employee> employees=new ArrayList<>();
    public EmployeeServiceImpl(){
        employees.add(Employee.builder().id(1).name("namzy").permantAddress("Athani")
                .currentAddress("bengaluru").phoneNumber(994501562L).build());
        employees.add(Employee.builder().id(2).name("abc").permantAddress("Abc")
                .currentAddress("abc").phoneNumber(994501562L).build());
        employees.add(Employee.builder().id(3).name("xyz").permantAddress("xyz")
                .currentAddress("xyz").phoneNumber(994501562L).build());
        employees.add(Employee.builder().id(4).name("mno").permantAddress("mno")
                .currentAddress("mno").phoneNumber(994501562L).build());
    }
    @Override
    public Employee add(Employee employee) {
        employees.add(employee);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @Override
    public Employee getEmployee(int id) {
        return employees.stream().
                filter(employee -> employee.getId()==id)
                .findFirst().orElseThrow();
    }
}
