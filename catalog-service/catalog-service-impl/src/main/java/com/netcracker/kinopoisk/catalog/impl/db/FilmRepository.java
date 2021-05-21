package com.netcracker.kinopoisk.catalog.impl.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.netcracker.kinopoisk.catalog.model.Film;

public interface FilmRepository extends JpaRepository<Film, String> {
	@Query("select f from Film f where f.externalId = :externalId")
    public Film findByExternalId(@Param("externalId") String externalId);
}
