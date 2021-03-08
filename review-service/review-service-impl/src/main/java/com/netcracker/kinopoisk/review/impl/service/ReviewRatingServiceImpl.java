package com.netcracker.kinopoisk.review.impl.service;

import java.util.NoSuchElementException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.netcracker.kinopoisk.review.api.dto.RatingDto;
import com.netcracker.kinopoisk.review.api.service.ReviewRatingService;
import com.netcracker.kinopoisk.review.impl.db.RatingRepository;
import com.netcracker.kinopoisk.review.model.Rating;


@Service
public class ReviewRatingServiceImpl implements ReviewRatingService {
	@Autowired
	private RatingRepository ratingRepository;
	@Autowired
	private RatingMapper ratingMapper;
	
	@Override
	public RatingDto getRating(String id) {
		Rating rating = ratingRepository.findById(id).orElseThrow(() -> new NoSuchElementException(String.format("Film not found, id: %s", id)));
		return ratingMapper.toDto(rating);
	}

	@Override
	public RatingDto createRating(RatingDto ratingDto) {
		Rating rating = ratingMapper.toEntity(ratingDto);
		if (StringUtils.isEmpty(rating.getId())) {
			rating.setId(UUID.randomUUID().toString());
		}
		ratingRepository.save(rating);
		return ratingMapper.toDto(rating);
	}

	@Override
	public RatingDto updateRating(RatingDto ratingDto) {
		Rating rating = ratingRepository.findById(ratingDto.getId()).orElseThrow(() -> new NoSuchElementException(String.format("Film not found, id: %s", ratingDto.getId())));
		rating = ratingMapper.toEntity(ratingDto);
		ratingRepository.save(rating);
		return ratingMapper.toDto(rating);
	}

	@Override
	public void deleteRating(String id) {
		ratingRepository.deleteById(id);
	}

}
