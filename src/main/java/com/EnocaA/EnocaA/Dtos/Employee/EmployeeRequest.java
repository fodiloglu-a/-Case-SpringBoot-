package com.EnocaA.EnocaA.Dtos.Employee;

import lombok.Data;

@Data
public class EmployeeRequest {
    private String employeeName;
    private String employeeSurname;
    private String employeeAddress;
    private String employeeEmail;
    private int employeeAge;
    private int companyId;
}
