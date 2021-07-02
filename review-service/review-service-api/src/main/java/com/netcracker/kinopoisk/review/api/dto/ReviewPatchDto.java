package com.netcracker.kinopoisk.review.api.dto;

import java.util.Optional;

import javax.validation.constraints.PositiveOrZero;

import lombok.Data;

@Data
public class ReviewPatchDto {
	private String id;
	private Optional<UserDto> user;
	private Optional<FilmDto> film;
	private Optional<String> text;
	private Optional<String> status;
	@PositiveOrZero
	private Optional<Integer> likes;
	@PositiveOrZero
	private Optional<Integer> dislikes;
}
