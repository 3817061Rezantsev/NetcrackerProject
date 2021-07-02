package com.netcracker.kinopoisk.review.impl.service;

import org.springframework.stereotype.Component;

import com.netcracker.kinopoisk.review.api.dto.FilmDto;
import com.netcracker.kinopoisk.review.api.dto.RatingPatchDto;
import com.netcracker.kinopoisk.review.model.Film;
import com.netcracker.kinopoisk.review.model.Rating;

@Component
public class RatingPatchMapper {

	public void patchEntity(Rating rating, RatingPatchDto ratingDto) {
		if (ratingDto.getFilmId() != null) {
			rating.setFilmId(filmDtoToFilm(ratingDto.getFilmId().get()));
		}
		if (ratingDto.getScore() != null) {
			rating.setScore(ratingDto.getScore().get());
		}
	}

	protected Film filmDtoToFilm(FilmDto filmDto) {
		if (filmDto == null) {
			return null;
		}

		Film film = new Film();

		film.setId(filmDto.getId());
		film.setThirdPartyId(filmDto.getThirdPartyId());

		return film;
	}
}
