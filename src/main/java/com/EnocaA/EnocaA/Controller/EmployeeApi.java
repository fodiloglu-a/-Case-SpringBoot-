package com.EnocaA.EnocaA.Controller;

import com.EnocaA.EnocaA.Dtos.Employee.EmployeeRequest;
import com.EnocaA.EnocaA.Dtos.Employee.EmployeeResponse;
import com.EnocaA.EnocaA.Dtos.Employee.EmployeeUpdate;
import com.EnocaA.EnocaA.Services.EmployeeManager;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")//localhost:8090/employee/
public class EmployeeApi {
    private final EmployeeManager employeeManager;

    @PostMapping("/addEmployee")//localhost:8081/employee/addEmployee
    public ResponseEntity<String> addEmployee(@RequestBody EmployeeRequest employeeRequest){
        return ResponseEntity.ok().body(this.employeeManager.addEmployee(employeeRequest));

    }

    @GetMapping("/getEmployeeByName")//localhost:8081/employee/getEmployeeByName
    public ResponseEntity< EmployeeResponse > getEmployeeByName(@RequestParam String employeeName){
        return ResponseEntity.ok().body(this.employeeManager.getEmployeeByName(employeeName));
    }
    @GetMapping("/listAllEmployee")//localhost:8081/employee/listAllEmployee
    public ResponseEntity<List<EmployeeResponse>> listAllEmployee(){
        return ResponseEntity.ok().body(this.employeeManager.listAllEmployee());
    }


    @DeleteMapping("/deleteEmployeeById")//localhost:8088/employee/deleteEmployeeByName
    public ResponseEntity<String>deleteEmployeeByName(@RequestParam int employeeId){
        return ResponseEntity.ok().body(this.employeeManager.deleteEmployeeByName(employeeId));
    }


    @PutMapping("/updateEmployeeByName")//localhost:8081/employee/updateEmployeeByName
    public ResponseEntity<String> updateEmployeeByName(@RequestBody  EmployeeUpdate employeeUpdate){
        return ResponseEntity.ok().body(this.employeeManager.updateEmployeeByName(employeeUpdate));
    }


}