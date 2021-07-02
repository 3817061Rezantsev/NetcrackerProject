package com.netcracker.kinopoisk.review.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netcracker.kinopoisk.review.api.dto.RatingDto;
import com.netcracker.kinopoisk.review.api.dto.RatingPatchDto;
import com.netcracker.kinopoisk.review.api.service.ReviewRatingService;

@RestController
@RequestMapping(value = "/review")
public class ReviewRatingController {
	@Autowired
	private ReviewRatingService reviewRatingService;

	@GetMapping("/view/rating/{id}")
	public RatingDto getRating(@PathVariable("id") String id) {
		return reviewRatingService.getRating(id);
	}

	@PostMapping("/admin/rating")
	public RatingDto createRating(@RequestBody RatingDto ratingDto) {
		return reviewRatingService.createRating(ratingDto);
	}

	@PutMapping("/rating")
	public RatingDto updateRating(@RequestBody RatingPatchDto ratingDto) {
		return reviewRatingService.updateRating(ratingDto);
	}

	@DeleteMapping("/admin/rating/{id}")
	public void deleteRating(@PathVariable("id") String id) {
		reviewRatingService.deleteRating(id);
	}
}
