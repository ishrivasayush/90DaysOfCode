package com.narainox.firstJobApp.comapany;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface CompanyRepository extends JpaRepository<Company,Long> {
}
