package com.netcracker.kinopoisk.review.api.service;

import com.netcracker.kinopoisk.review.api.dto.FilmDto;


public interface ReviewFilmService {
	FilmDto getFilm(String id);
	
	FilmDto createFilm(FilmDto filmDto);

	FilmDto updateFilm(FilmDto filmDto);

	void deleteFilm(String id);

}
