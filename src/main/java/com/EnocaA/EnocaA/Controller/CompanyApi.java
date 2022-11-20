package com.EnocaA.EnocaA.Controller;

import com.EnocaA.EnocaA.Dtos.Company.CompanyRequest;
import com.EnocaA.EnocaA.Dtos.Company.CompanyResponse;
import com.EnocaA.EnocaA.Dtos.Company.CompanyUpdate;
import com.EnocaA.EnocaA.Services.CompanyManager;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/company")//localhost:8090/company/
public class CompanyApi {
    private final CompanyManager companyManager;
    @PostMapping("/addCompany")//localhost:8090/company/addCompany
    public ResponseEntity<String> addCompany(@RequestBody CompanyRequest companyRequest){
        return ResponseEntity.ok(this.companyManager.addCompany(companyRequest));
    }
    @GetMapping("/getCompanyByName")//localhost:8090/company/getCompanyByName
    public  ResponseEntity<CompanyResponse> getCompanyByName(@RequestParam String companyName){
        return ResponseEntity.ok().body(this.companyManager.getCompanyByName(companyName));
    }
    @GetMapping("/listAllCompany")//localhost:8090/company/listAllCompany
    public ResponseEntity<List<CompanyResponse>> listAllCompany(){
        return ResponseEntity.ok().body(this.companyManager.listAllCompany());
    }


    @DeleteMapping("/deleteCompanyByName")//localhost:8090/company/deleteCompanyByName
    public  ResponseEntity<String> deleteCompanyByName(@RequestParam String companyName){
        return ResponseEntity.ok().body(this.companyManager.deleteCompanyByName(companyName));
    }
    @PutMapping("/updateCompanyByName")//localhost:8090/company/updateCompanyByName
    public ResponseEntity<String> updateCompanyByName(@RequestBody CompanyUpdate companyUpdate){
        return ResponseEntity.ok().body(this.companyManager.updateCompanyByName(companyUpdate));
    }


}