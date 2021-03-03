package com.netcracker.kinopoisk.review.impl.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.netcracker.kinopoisk.review.model.Review;

public interface ReviewRepository extends JpaRepository<Review, String> {

}
