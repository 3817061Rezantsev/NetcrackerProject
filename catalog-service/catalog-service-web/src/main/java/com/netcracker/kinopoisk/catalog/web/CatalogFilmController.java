package com.netcracker.kinopoisk.catalog.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netcracker.kinopoisk.catalog.api.dto.FilmDto;
import com.netcracker.kinopoisk.catalog.api.dto.FilmPatchDto;
import com.netcracker.kinopoisk.catalog.api.service.CatalogService;

@RestController
@RequestMapping(value = "/catalog")
public class CatalogFilmController {
	@Autowired
	private CatalogService catalogService;

	@GetMapping("/film/{id}")
	public FilmDto getFilm(@PathVariable("id") String id) {
		return catalogService.getFilm(id);
	}

	@PostMapping("/film")
	public FilmDto createFilm(@Valid @RequestBody FilmDto filmDto) {
		return catalogService.createFilm(filmDto);
	}

	@PutMapping("/film")
	public FilmDto updateFilm(@Valid @RequestBody FilmPatchDto filmDto) {
		return catalogService.updateFilm(filmDto);
	}

	@DeleteMapping("/film/{id}")
	public void deleteFilm(@PathVariable("id") String id) {
		catalogService.deleteFilm(id);
	}
}
