package com.employee.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private int emp_id;
    private String name;
    private String emailId;
    private long phoneNum;
    private String gender;
    private String dept;

}
