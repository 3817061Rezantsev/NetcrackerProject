package com.netcracker.kinopoisk.review.impl.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.netcracker.kinopoisk.review.model.User;

public interface UserRepository extends JpaRepository<User, String> {

}
