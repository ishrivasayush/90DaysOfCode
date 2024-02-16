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

    @Override
    public String createReview(Long companyId, Review review) {
        Optional<Company> company = companyRepository.findById(companyId);
        if (company.isPresent()) {
            review.setCompany(company.get());
            repository.save(review);
            return "Review is Created";
        }
        return null;
    }
    @Override
    public void updateReview(Long companyId, Review review, Long reviewId) {
        Optional<Company> company = companyRepository.findById(companyId);
        List<Review> reviews = company.get().getReviews();
        for (Review r:reviews)
        {
            if (r.getId()==reviewId)
            {
                r.setDescription(review.getDescription());
                r.setTitle(review.getTitle());
                r.setRating(review.getRating());
                repository.save(r);
            }
        }
    }
}

