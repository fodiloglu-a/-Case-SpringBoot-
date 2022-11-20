package com.EnocaA.EnocaA.Services;


import com.EnocaA.EnocaA.Dtos.Company.CompanyRequest;
import com.EnocaA.EnocaA.Dtos.Company.CompanyResponse;
import com.EnocaA.EnocaA.Dtos.Company.CompanyUpdate;

import java.util.List;

public interface ICompanyServices {

    String addCompany(CompanyRequest companyRequest);
    CompanyResponse getCompanyByName(String companyName);
    List<CompanyResponse> listAllCompany();
    String deleteCompanyByName(String companyName);
    String updateCompanyByName(CompanyUpdate companyUpdate);

}
