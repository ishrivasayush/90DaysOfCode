package com.narainox.firstJobApp.review;

import java.util.List;

public interface ReviewService {
    List<Review> getAllReviews(Long companyId);
    String createReview(Long companyId,Review review);
    void updateReview(Long companyId, Review review, Long reviewId);
}
