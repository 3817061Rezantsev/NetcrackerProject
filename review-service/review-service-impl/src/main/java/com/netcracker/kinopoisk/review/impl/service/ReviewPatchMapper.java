package com.netcracker.kinopoisk.review.impl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.netcracker.kinopoisk.review.api.dto.FilmDto;
import com.netcracker.kinopoisk.review.api.dto.ReviewPatchDto;
import com.netcracker.kinopoisk.review.model.Film;

import com.netcracker.kinopoisk.review.model.Review;

@Component
public class ReviewPatchMapper {
	@Autowired
	private UserMapper userMapper;

	public void patchEntity(Review review, ReviewPatchDto reviewDto) {
		if (reviewDto.getFilm() != null) {
			review.setFilm(filmDtoToFilm(reviewDto.getFilm().get()));
		}
		if (reviewDto.getUser() != null) {
			review.setUser(userMapper.toEntity(reviewDto.getUser().get()));
		}
		if (reviewDto.getText() != null) {
			review.setText(reviewDto.getText().get());
		}
		if (reviewDto.getStatus() != null) {
			review.setStatus(reviewDto.getStatus().get());
		}
		if (reviewDto.getLikes() != null) {
			review.setLikes(reviewDto.getLikes().get());
		}
		if (reviewDto.getDislikes() != null) {
			review.setDislikes(reviewDto.getDislikes().get());
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
