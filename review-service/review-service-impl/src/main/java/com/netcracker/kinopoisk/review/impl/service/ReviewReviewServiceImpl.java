package com.netcracker.kinopoisk.review.impl.service;

import java.util.NoSuchElementException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.netcracker.kinopoisk.review.api.dto.ReviewDto;
import com.netcracker.kinopoisk.review.api.service.ReviewReviewService;
import com.netcracker.kinopoisk.review.impl.db.ReviewRepository;
import com.netcracker.kinopoisk.review.model.Review;


@Service
public class ReviewReviewServiceImpl implements ReviewReviewService {
	@Autowired
	private ReviewRepository reviewRepository;
	@Autowired
	private ReviewMapper reviewMapper;
	
	@Override
	public ReviewDto getReview(String id) {
		Review review = reviewRepository.findById(id).orElseThrow(() -> new NoSuchElementException(String.format("Film not found, id: %s", id)));
		return reviewMapper.toDto(review);
	}

	@Override
	public ReviewDto createReview(ReviewDto reviewDto) {
		Review review = reviewMapper.toEntity(reviewDto);
		if (StringUtils.isEmpty(review.getId())) {
			review.setId(UUID.randomUUID().toString());
		}
		reviewRepository.save(review);
		return reviewMapper.toDto(review);
	}

	@Override
	public ReviewDto updateReview(ReviewDto reviewDto) {
		Review review = reviewRepository.findById(reviewDto.getId()).orElseThrow(() -> new NoSuchElementException(String.format("Film not found, id: %s", reviewDto.getId())));
		review = reviewMapper.toEntity(reviewDto);
		reviewRepository.save(review);
		return reviewMapper.toDto(review);
	}

	@Override
	public void deleteReview(String id) {
		reviewRepository.deleteById(id);
	}

}
