package com.employee.repository;

import com.employee.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class EmployeeRepoImpl implements EmployeeRepo{
    private Map<Integer, Employee> employeeMap = new HashMap<>();
    @Override
    public String createEmployee(Employee employee) {
        if(existEmployee(employee.getEmp_id())){
            return "Employee with id " + employee.getEmp_id() + " already exist!";
        }
        employeeMap.put(employee.getEmp_id(), employee);
        return "Successfully inserted!";
    }

    //helper function
    private boolean existEmployee(int emp_id){
        if(employeeMap.containsKey(emp_id))
            return true;
        else
            return false;
    }

    //gel all employee
    @Override
    public List<Employee> getAllEmployee() {
        List<Employee> employees = new ArrayList<>();
        for(int k: employeeMap.keySet()){
            employees.add(employeeMap.get(k));
        }
        return employees;
    }

    //get all employee by id
    @Override
    public Employee getEmployeeById(int empId) {
        if(existEmployee(empId)){
            return employeeMap.get(empId);
        }
        return null;
    }

    //delete employee by id
    @Override
    public String deleteEmployeeById(int empId) {
        if(existEmployee(empId)){
            employeeMap.remove(empId);
            return "SuccessFully deleted!";
        }
        return "Employee with id " + empId + " doesn't exist!";
    }

    //update employee by id
    @Override
    public String updateEmployeeById(int empId, Employee employee) {
        if(existEmployee(empId)){
            employeeMap.put(empId, employee);
            return "Successfully Updated!";
        }
        return "Employee with id " + empId + " doesn't exist!";
    }
}
