package com.narainox.firstJobApp.comapany;

import java.util.List;

public interface CompanyService {
    List<Company> getAllCompanies();
    Company updateCompany(Long companyId,Company company);

}
