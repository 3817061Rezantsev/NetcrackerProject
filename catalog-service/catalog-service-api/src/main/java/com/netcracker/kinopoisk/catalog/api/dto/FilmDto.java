package com.netcracker.kinopoisk.catalog.api.dto;

import java.util.List;

import lombok.Data;

@Data
public class FilmDto {
	private String id;
	private String name;
	private StudioDto studio;
	private List<ActorDto> actors;
	private ProducerDto producer;
	private Integer score;
	private Integer views;
}
