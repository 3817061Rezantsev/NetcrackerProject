package com.netcracker.kinopoisk.catalog.impl.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.netcracker.kinopoisk.catalog.model.Genre;

public interface GenreRepository extends JpaRepository<Genre, String>{

}
