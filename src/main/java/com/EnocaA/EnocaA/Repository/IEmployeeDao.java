package com.EnocaA.EnocaA.Repository;

import com.EnocaA.EnocaA.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmployeeDao extends JpaRepository<Employee,Long> {


    List<Employee> findEmployeeByCompany_Id(Long id);
    Employee findByEmployeeName(String employeeName);


}
