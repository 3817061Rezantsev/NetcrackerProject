package com.netcracker.kinopoisk.catalog.api.service;

import com.netcracker.kinopoisk.catalog.api.dto.FilmDto;
import com.netcracker.kinopoisk.catalog.api.dto.StudioDto;

public interface CatalogService {
	FilmDto getFilm(String id);

	StudioDto getStudio(String id);
}
