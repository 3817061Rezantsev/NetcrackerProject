package com.netcracker.kinopoisk.review.api.dto;

import javax.validation.constraints.PositiveOrZero;

import lombok.Data;

@Data
public class ReviewDto {
	private String id;
	private UserDto user;
	private FilmDto film;
	private String text;
	private String status;
	@PositiveOrZero
	private Integer likes;
	@PositiveOrZero
	private Integer dislikes;
}
