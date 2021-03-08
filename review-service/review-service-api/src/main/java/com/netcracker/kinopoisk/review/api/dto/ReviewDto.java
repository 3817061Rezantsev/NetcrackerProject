package com.netcracker.kinopoisk.review.api.dto;

import lombok.Data;

@Data
public class ReviewDto {
	private String id;
	private UserDto user;
	private FilmDto film;
	private String text;
	private String status;
	private Integer likes;
	private Integer dislikes;
}
