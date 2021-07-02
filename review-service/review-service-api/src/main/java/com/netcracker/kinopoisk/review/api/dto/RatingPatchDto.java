package com.netcracker.kinopoisk.review.api.dto;

import java.util.Optional;

import javax.validation.constraints.PositiveOrZero;

import lombok.Data;

@Data
public class RatingPatchDto {
	private String id;
	private Optional<FilmDto> filmId;
	@PositiveOrZero
	private Optional<String> score;
}
