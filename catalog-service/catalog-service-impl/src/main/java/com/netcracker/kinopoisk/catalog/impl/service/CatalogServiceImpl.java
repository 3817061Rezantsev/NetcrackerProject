package com.netcracker.kinopoisk.catalog.impl.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netcracker.kinopoisk.catalog.api.dto.FilmDto;
import com.netcracker.kinopoisk.catalog.api.dto.StudioDto;
import com.netcracker.kinopoisk.catalog.api.service.CatalogService;
import com.netcracker.kinopoisk.catalog.impl.db.Studio;
import com.netcracker.kinopoisk.catalog.impl.db.StudioRepository;

@Service
public class CatalogServiceImpl implements CatalogService {
	@Autowired
	private StudioRepository studioRepository;

	@Override
	public FilmDto getFilm(String id) {
		FilmDto filmDto = new FilmDto();
		filmDto.setId(id);
		return filmDto;
	}

	@Override
	public StudioDto getStudio(String id) {
		Studio studio = studioRepository.findById(id).orElseThrow(() -> new NoSuchElementException(String.format("Studio not found, id: %s", id)));
		StudioDto studioDto = new StudioDto();
		studioDto.setId(studio.getId());
		studioDto.setName(studio.getName());
		studioDto.setOwner(studio.getOwner());
		studioDto.setLocation(studio.getLocation());
		return studioDto;
	}

}
