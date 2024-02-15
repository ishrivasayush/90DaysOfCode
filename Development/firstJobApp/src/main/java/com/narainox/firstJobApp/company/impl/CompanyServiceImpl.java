package com.narainox.firstJobApp.company.impl;

import com.narainox.firstJobApp.company.Company;
import com.narainox.firstJobApp.company.CompanyRepository;
import com.narainox.firstJobApp.company.CompanyService;
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

    @Override
    public void createCompany(Company company) {
        companyRepository.save(company);
    }

    @Override
    public void deleteCompany(Long companyId) {
        companyRepository.deleteById(companyId);
    }

    @Override
    public Company getCompany(Long companyId) {
        Optional<Company> company = companyRepository.findById(companyId);
        if (company.isPresent())
        {
            return company.get();
        }
        return null;
    }

}
