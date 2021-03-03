package com.netcracker.kinopoisk.review.api.dto;

import lombok.Data;

@Data
public class RatingDto {
	private String id;
	private FilmDto filmId;
	private String score;

}
