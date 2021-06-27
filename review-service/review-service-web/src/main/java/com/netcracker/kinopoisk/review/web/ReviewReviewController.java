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

import com.netcracker.kinopoisk.review.api.dto.ReviewDto;
import com.netcracker.kinopoisk.review.api.service.ReviewReviewService;

@RestController
@RequestMapping(value = "/review")
public class ReviewReviewController {
	@Autowired
	private ReviewReviewService reviewReviewService;

	@GetMapping("/view/review/{id}")
	public ReviewDto getReview(@PathVariable("id") String id) {
		return reviewReviewService.getReview(id);
	}

	@PostMapping("/review")
	public ReviewDto createReview(@RequestBody ReviewDto reviewDto) {
		return reviewReviewService.createReview(reviewDto);
	}

	@PutMapping("/admin/review")
	public ReviewDto updateReview(@RequestBody ReviewDto reviewDto) {
		return reviewReviewService.updateReview(reviewDto);
	}

	@DeleteMapping("/admin/review/{id}")
	public void deleteReview(@PathVariable("id") String id) {
		reviewReviewService.deleteReview(id);
	}
}
