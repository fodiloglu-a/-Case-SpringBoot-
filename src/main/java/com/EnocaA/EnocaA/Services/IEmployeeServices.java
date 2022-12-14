package com.EnocaA.EnocaA.Services;

import com.EnocaA.EnocaA.Dtos.Employee.EmployeeRequest;
import com.EnocaA.EnocaA.Dtos.Employee.EmployeeResponse;
import com.EnocaA.EnocaA.Dtos.Employee.EmployeeUpdate;
import com.EnocaA.EnocaA.Model.Employee;

import java.util.List;

public interface IEmployeeServices {
    String addEmployee(EmployeeRequest employeeRequest);
    EmployeeResponse getEmployeeByName(String employeeName);
    List< EmployeeResponse> listAllEmployee();
    String deleteEmployeeByName(int employeeId);
    String updateEmployeeByName(EmployeeUpdate employeeUpdate);
    List<EmployeeResponse> findEmployeeByCompany_Id(Long id);}

