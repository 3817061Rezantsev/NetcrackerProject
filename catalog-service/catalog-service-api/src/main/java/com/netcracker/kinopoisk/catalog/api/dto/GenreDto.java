package com.netcracker.kinopoisk.catalog.api.dto;

import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class GenreDto {
	private String id;
	@Size(min = 1, max = 45)
	private String genreName;
}
