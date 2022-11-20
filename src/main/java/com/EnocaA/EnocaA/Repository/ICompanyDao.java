package com.EnocaA.EnocaA.Repository;

import com.EnocaA.EnocaA.Model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICompanyDao extends JpaRepository<Company,Long> {
    Company findByCompanyName(String companyName);

}
