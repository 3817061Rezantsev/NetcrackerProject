package com.netcracker.kinopoisk.review.api.service;

import com.netcracker.kinopoisk.review.api.dto.ReviewDto;

public interface ReviewReviewService {
	ReviewDto getReview(String id);

	ReviewDto createReview(ReviewDto reviewDto);
	
	ReviewDto updateReview(ReviewDto reviewDto);
	
	void deleteReview(String id);
}
