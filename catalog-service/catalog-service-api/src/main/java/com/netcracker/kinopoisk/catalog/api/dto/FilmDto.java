package com.netcracker.kinopoisk.catalog.api.dto;


import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class FilmDto {
	private String id;
	@NotBlank
	@Size(min = 1, max = 45)
	private String name;
	private StudioDto studio;
	private List<ActorDto> actors;
	private ProducerDto producer;
	@PositiveOrZero
	private Integer score;
	@PositiveOrZero
	private Integer views;
	private String externalId;
	private List<GenreDto> genres;
} 