package com.netcracker.kinopoisk.review.api.service;

import com.netcracker.kinopoisk.review.api.dto.ReviewDto;
import com.netcracker.kinopoisk.review.api.dto.ReviewPatchDto;

public interface ReviewReviewService {
	ReviewDto getReview(String id);

	ReviewDto createReview(ReviewDto reviewDto);

	ReviewDto updateReview(ReviewPatchDto reviewDto);

	void deleteReview(String id);
}
