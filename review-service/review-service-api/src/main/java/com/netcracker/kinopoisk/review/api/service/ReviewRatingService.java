package com.netcracker.kinopoisk.review.api.service;

import com.netcracker.kinopoisk.review.api.dto.RatingDto;

public interface ReviewRatingService {
	RatingDto getRating(String id);

	RatingDto createRating(RatingDto ratingDto);
	
	RatingDto updateRating(RatingDto ratingDto);
	
	void deleteRating(String id);
}
