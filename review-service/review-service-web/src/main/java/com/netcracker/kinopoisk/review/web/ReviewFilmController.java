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

import com.netcracker.kinopoisk.review.api.dto.FilmDto;
import com.netcracker.kinopoisk.review.api.service.ReviewFilmService;

@RestController
@RequestMapping(value = "/review")
public class ReviewFilmController {

	@Autowired
	private ReviewFilmService reviewFilmService;

	@GetMapping("/view/film/{id}")
	public FilmDto getFilm(@PathVariable("id") String id) {
		return reviewFilmService.getFilm(id);
	}

	@PostMapping("/admin/film")
	public FilmDto createFilm(@RequestBody FilmDto filmDto) {
		return reviewFilmService.createFilm(filmDto);
	}

	@PutMapping("/admin/film")
	public FilmDto updateFilm(@RequestBody FilmDto filmDto) {
		return reviewFilmService.updateFilm(filmDto);
	}

	@DeleteMapping("/admin/film/{id}")
	public void deleteFilm(@PathVariable("id") String id) {
		reviewFilmService.deleteFilm(id);
	}
}
