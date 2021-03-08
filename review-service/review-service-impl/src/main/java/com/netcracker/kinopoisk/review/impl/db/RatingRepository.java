package com.netcracker.kinopoisk.review.impl.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.netcracker.kinopoisk.review.model.Rating;

public interface RatingRepository extends JpaRepository<Rating, String> {

}
