package com.netcracker.kinopoisk.review.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netcracker.kinopoisk.review.api.dto.FilmDto;
import com.netcracker.kinopoisk.review.api.service.ReviewService;

@RestController
@RequestMapping(value = "/review")
public class ReviewController {

	@Autowired
	private ReviewService reviewService;

	@GetMapping("/film/{id}")
	public FilmDto getFilm(@PathVariable("id") String id) {
		return reviewService.getFilm(id);
	}
}
