package com.narainox.firstJobApp.review.impl;

import com.narainox.firstJobApp.company.Company;
import com.narainox.firstJobApp.company.CompanyRepository;
import com.narainox.firstJobApp.review.Review;
import com.narainox.firstJobApp.review.ReviewRepository;
import com.narainox.firstJobApp.review.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    private ReviewRepository repository;
    @Autowired
    private CompanyRepository companyRepository;


    @Override
    public List<Review> getAllReviews(Long companyId) {
        Optional<Company> company = companyRepository.findById(companyId);
        if (company.isPresent())
        {
            return repository.findByCompanyId(companyId);
        }
       return null;
    }
}
