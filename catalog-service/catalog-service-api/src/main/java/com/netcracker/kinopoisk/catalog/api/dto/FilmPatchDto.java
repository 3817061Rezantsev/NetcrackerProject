package com.netcracker.kinopoisk.catalog.api.dto;

import java.util.List;
import java.util.Optional;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class FilmPatchDto {
	private String id;
	@NotBlank
	@Size(min = 1, max = 45)
	private Optional<String> name;
	private Optional<StudioDto> studio;
	private Optional<List<ActorDto>> actors;
	private Optional<ProducerDto> producer;
	@PositiveOrZero
	private Optional<Integer> score;
	@PositiveOrZero
	private Optional<Integer> views;
	private Optional<String> externalId;
	private Optional<List<GenreDto>> genres;
}
