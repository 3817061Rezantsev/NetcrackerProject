package com.netcracker.kinopoisk.review.impl.service;

import org.mapstruct.Mapper;

import com.netcracker.kinopoisk.review.api.dto.RatingDto;
import com.netcracker.kinopoisk.review.model.Film;
import com.netcracker.kinopoisk.review.model.Rating;

@Mapper(uses = { Film.class }, componentModel = "spring")
public interface RatingMapper {
	RatingDto toDto(Rating film);

	Rating toEntity(RatingDto filmDto);
}
