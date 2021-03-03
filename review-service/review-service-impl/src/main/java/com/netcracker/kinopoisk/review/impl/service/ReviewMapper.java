package com.netcracker.kinopoisk.review.impl.service;

import org.mapstruct.Mapper;

import com.netcracker.kinopoisk.review.api.dto.ReviewDto;
import com.netcracker.kinopoisk.review.model.Review;

@Mapper(uses = { UserMapper.class, FilmMapper.class }, componentModel = "spring")
public interface ReviewMapper {
	ReviewDto toDto(Review review);

	Review toEntity(ReviewDto reviewDto);
}
