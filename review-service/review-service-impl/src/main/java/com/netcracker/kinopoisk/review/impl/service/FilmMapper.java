package com.netcracker.kinopoisk.review.impl.service;

import org.mapstruct.Mapper;

import com.netcracker.kinopoisk.review.api.dto.FilmDto;
import com.netcracker.kinopoisk.review.model.Film;

@Mapper(componentModel = "spring")
public interface FilmMapper {
	FilmDto toDto(Film film);

	Film toEntity(FilmDto filmDto);
}
