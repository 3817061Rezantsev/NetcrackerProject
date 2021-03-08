package com.netcracker.kinopoisk.catalog.impl.service;

import org.mapstruct.Mapper;

import com.netcracker.kinopoisk.catalog.api.dto.FilmDto;
import com.netcracker.kinopoisk.catalog.model.Film;

@Mapper(uses = { StudioMapper.class, PersonMapper.class }, componentModel = "spring")
public interface FilmMapper {
	FilmDto toDto(Film film);

	Film toEntity(FilmDto filmDto);
}
