package com.narainox.firstJobApp.comapany.impl;

import com.narainox.firstJobApp.comapany.Company;
import com.narainox.firstJobApp.comapany.CompanyRepository;
import com.narainox.firstJobApp.comapany.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;


    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public Company updateCompany(Long companyId, Company company) {
        Optional<Company> comp = companyRepository.findById(companyId);
        if (comp.isPresent())
        {
            Company company1=comp.get();
            company1.setDescription(company.getDescription());
            company1.setJobs(company.getJobs());
            company1.setName(company.getName());
            return company1;
        }
        return null;
    }

}
