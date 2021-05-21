package com.netcracker.kinopoisk.catalog.impl.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.netcracker.kinopoisk.catalog.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, String> {
	@Query("select f from Movie f where f.filmId = :filmId")
    public Movie findByFilmId(@Param("filmId") String filmId);
}
