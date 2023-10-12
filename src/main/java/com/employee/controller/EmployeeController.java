package com.employee.controller;

import com.employee.EmployeeApplication;
import com.employee.model.Employee;
import com.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Note:- endPoints (APIs) can be same in case of different methods
@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    //Create --> insert data
    @PostMapping("/employee")
    private String createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

    //Get --> fetch all employees
    @GetMapping("/employees")
    private List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    //Get --> fetch employee by id
    @GetMapping("/employee/{empId}")
    private Employee getEmployeeById(@PathVariable int empId){
        return employeeService.getEmployeeById(empId);
    }

    //Update --> update employee by id
    @PutMapping("/employee/{empId}")
    private String updateEmployeeById(@PathVariable int empId, @RequestBody Employee employee){
        return employeeService.updateEmployeeById(empId, employee);
    }

    //Delete --> delete employee by id
    @DeleteMapping("/employee/{empId}")
    private String deleteEmployeeById(@PathVariable int empId){
        return employeeService.deleteEmployeeById(empId);
    }



}
