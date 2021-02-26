package com.netcracker.kinopoisk.review.impl.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netcracker.kinopoisk.review.api.dto.FilmDto;
import com.netcracker.kinopoisk.review.api.service.ReviewService;
import com.netcracker.kinopoisk.review.impl.db.Film;
import com.netcracker.kinopoisk.review.impl.db.FilmRepository;

@Service
public class ReviewServiceImpl implements ReviewService {
	@Autowired
	private FilmRepository filmRepository;

	@Override
	public FilmDto getFilm(String id) {
		Film film = filmRepository.findById(id).orElseThrow(() -> new NoSuchElementException(String.format("Film not found, id: %s", id)));
		FilmDto filmDto = new FilmDto();
		filmDto.setId(film.getId());
		filmDto.setThird_party_id(film.getThird_party_id());
		return filmDto;
	}

}
