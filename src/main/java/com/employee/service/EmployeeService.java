package com.employee.service;

import com.employee.model.Employee;

import java.util.List;

public interface EmployeeService {
    String createEmployee(Employee employee);

    List<Employee> getAllEmployee();

    Employee getEmployeeById(int empId);

    String deleteEmployeeById(int empId);

    String updateEmployeeById(int empId, Employee employee);
}
