package com.netcracker.kinopoisk.catalog.api.service;

import com.netcracker.kinopoisk.catalog.api.dto.FilmDto;
<<<<<<< HEAD
import com.netcracker.kinopoisk.catalog.api.dto.PersonDto;
import com.netcracker.kinopoisk.catalog.api.dto.StudioDto;

public interface CatalogService {
	FilmDto getFilm(String id);

	FilmDto createFilm(FilmDto filmDto);

	FilmDto updateFilm(FilmDto filmDto);

	void deleteFilm(String id);

	StudioDto getStudio(String id);

	StudioDto createStudio(StudioDto studioDto);

	StudioDto updateStudio(StudioDto studioDto);

	void deleteStudio(String id);

	PersonDto getPerson(String id);

	PersonDto createPerson(PersonDto personDto);

	PersonDto updatePerson(PersonDto personDto);

	void deletePerson(String id);

=======
import com.netcracker.kinopoisk.catalog.api.dto.StudioDto;

public interface CatalogService {
	FilmDto getFilm(String id);

	StudioDto getStudio(String id);
>>>>>>> refs/remotes/origin/main
}
