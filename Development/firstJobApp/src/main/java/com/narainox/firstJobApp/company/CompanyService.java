package com.narainox.firstJobApp.company;

import java.util.List;

public interface CompanyService {
    List<Company> getAllCompanies();
    Company updateCompany(Long companyId,Company company);
    void createCompany(Company company);
    void deleteCompany(Long companyId);

    Company getCompany(Long companyId);
}
