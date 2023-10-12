package com.employee.service;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeRepo employeeRepo;
    @Override
    public String createEmployee(Employee employee) {
        return employeeRepo.createEmployee(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepo.getAllEmployee();
    }

    @Override
    public Employee getEmployeeById(int empId) {
        return employeeRepo.getEmployeeById(empId);
    }

    @Override
    public String deleteEmployeeById(int empId) {
        return employeeRepo.deleteEmployeeById(empId);
    }

    @Override
    public String updateEmployeeById(int empId, Employee employee) {
        return employeeRepo.updateEmployeeById(empId, employee);
    }
}
