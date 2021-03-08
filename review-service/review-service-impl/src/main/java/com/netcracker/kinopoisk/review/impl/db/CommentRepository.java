package com.netcracker.kinopoisk.review.impl.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.netcracker.kinopoisk.review.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, String> {

}
