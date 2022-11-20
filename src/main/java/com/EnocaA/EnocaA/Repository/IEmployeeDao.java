package com.EnocaA.EnocaA.Repository;

import com.EnocaA.EnocaA.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeDao extends JpaRepository<Employee,Long> {
    Employee findByEmployeeName(String employeeName);


}
