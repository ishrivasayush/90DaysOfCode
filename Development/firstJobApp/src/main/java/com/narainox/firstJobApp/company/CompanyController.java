package com.narainox.firstJobApp.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @GetMapping("/")
    public ResponseEntity<List<Company>> getCompanyList()
    {
        return new ResponseEntity<>(companyService.getAllCompanies(), HttpStatus.OK);
    }

    @PutMapping("/{companyId}")
    public ResponseEntity<Company> updateCompany(@PathVariable Long companyId,@RequestBody Company company)
    {
        return new ResponseEntity<>(companyService.updateCompany(companyId,company),HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<String> createCompany(@RequestBody Company company)
    {
        companyService.createCompany(company);
        return new ResponseEntity<>("Company is created",HttpStatus.CREATED);
    }

    @DeleteMapping("/{companyId}")
    public ResponseEntity<String> deleteCompany(@PathVariable Long companyId)
    {
        companyService.deleteCompany(companyId);
        return new ResponseEntity<>("Company is deleted.",HttpStatus.OK);
    }

    @GetMapping("/{companyId}")
    public ResponseEntity<Company> getCompanyById(@PathVariable Long companyId)
    {
        return new ResponseEntity<>(companyService.getCompany(companyId),HttpStatus.OK);
    }



}
