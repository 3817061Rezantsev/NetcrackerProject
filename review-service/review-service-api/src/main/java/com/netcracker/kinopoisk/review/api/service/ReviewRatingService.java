package com.netcracker.kinopoisk.review.api.service;

import com.netcracker.kinopoisk.review.api.dto.RatingDto;
import com.netcracker.kinopoisk.review.api.dto.RatingPatchDto;

public interface ReviewRatingService {
	RatingDto getRating(String id);

	RatingDto createRating(RatingDto ratingDto);
	
	RatingDto updateRating(RatingPatchDto ratingDto);
	
	void deleteRating(String id);
}
