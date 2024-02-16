package com.narainox.firstJobApp.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies/{companyId}")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @GetMapping("/reviews")
    public ResponseEntity<List<Review>> getAllReviews(@PathVariable Long companyId)
    {
        return new ResponseEntity<>(reviewService.getAllReviews(companyId), HttpStatus.OK);
    }

    @PostMapping("/reviews")
    public ResponseEntity<String> createReview(@PathVariable
            Long companyId,@RequestBody Review review)
    {
        reviewService.createReview(companyId,review);
        return new ResponseEntity<>("Review is Created",HttpStatus.CREATED);
    }
    @PutMapping("/reviews/{reviewId}")
    public ResponseEntity<String> createReview(@PathVariable
                                               Long companyId,@RequestBody Review review,@PathVariable Long reviewId)
    {
        reviewService.updateReview(companyId,review,reviewId);
        return new ResponseEntity<>("Review is Updated",HttpStatus.OK);
    }

}
