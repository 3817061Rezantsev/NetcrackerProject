package com.netcracker.kinopoisk.catalog.api.dto;

import lombok.Data;

@Data
public class MovieDbFilmDto {
	private String id;
	private String title;
	private String overview;
	private String status;
	private Integer vote_count;
	private Integer budget;
}