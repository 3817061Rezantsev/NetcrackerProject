package com.netcracker.kinopoisk.review.api.service;

import com.netcracker.kinopoisk.review.api.dto.FilmDto;


public interface ReviewService {
	FilmDto getFilm(String id);

}
