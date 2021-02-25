package com.netcracker.kinopoisk.catalog.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netcracker.kinopoisk.catalog.api.dto.FilmDto;
import com.netcracker.kinopoisk.catalog.api.dto.StudioDto;
import com.netcracker.kinopoisk.catalog.api.service.CatalogService;

@RestController
@RequestMapping(value = "/catalog")
public class CatalogController {
	@Autowired
	private CatalogService catalogService;

	@GetMapping("/film/{id}")
	public FilmDto getFilm(@PathVariable("id") String id) {
		return catalogService.getFilm(id);
	}

	@GetMapping("/studio/{id}")
	public StudioDto getStudio(@PathVariable("id") String id) {
		return catalogService.getStudio(id);
	}
}
