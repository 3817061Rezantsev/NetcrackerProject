package com.netcracker.kinopoisk.catalog.api.service;

import com.netcracker.kinopoisk.catalog.api.dto.FilmDto;
import com.netcracker.kinopoisk.catalog.api.dto.FilmPatchDto;
import com.netcracker.kinopoisk.catalog.api.dto.PersonDto;
import com.netcracker.kinopoisk.catalog.api.dto.PersonPatchDto;
import com.netcracker.kinopoisk.catalog.api.dto.StudioDto;
import com.netcracker.kinopoisk.catalog.api.dto.StudioPatchDto;
import com.netcracker.kinopoisk.catalog.model.Film;

public interface CatalogService {
	FilmDto getFilm(String id);

	FilmDto createFilm(FilmDto filmDto);

	FilmDto updateFilm(FilmPatchDto filmDto);

	void deleteFilm(String id);

	StudioDto getStudio(String id);

	StudioDto createStudio(StudioDto studioDto);

	StudioDto updateStudio(StudioPatchDto studioDto);

	void deleteStudio(String id);

	PersonDto getPerson(String id);

	PersonDto createPerson(PersonDto personDto);

	PersonDto updatePerson(PersonPatchDto personDto);

	void deletePerson(String id);
}
