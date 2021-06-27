package com.netcracker.kinopoisk.review.api.dto;

import javax.validation.constraints.PositiveOrZero;

import lombok.Data;

@Data
public class RatingDto {
	private String id;
	private FilmDto filmId;
	@PositiveOrZero
	private String score;

}
