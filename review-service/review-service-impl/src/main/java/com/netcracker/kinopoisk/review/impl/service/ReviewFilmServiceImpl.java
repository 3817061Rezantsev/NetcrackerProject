package com.netcracker.kinopoisk.review.impl.service;

import java.util.NoSuchElementException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.netcracker.kinopoisk.review.model.Film;
import com.netcracker.kinopoisk.review.api.dto.FilmDto;
import com.netcracker.kinopoisk.review.api.service.ReviewFilmService;
import com.netcracker.kinopoisk.review.impl.db.FilmRepository;

@Service
public class ReviewFilmServiceImpl implements ReviewFilmService {
	@Autowired
	private FilmRepository filmRepository;
	@Autowired
	private FilmMapper filmMapper;

	@Override
	public FilmDto getFilm(String id) {
		Film film = filmRepository.findById(id).orElseThrow(() -> new NoSuchElementException(String.format("Film not found, id: %s", id)));
		return filmMapper.toDto(film);
	}

	@Override
	public FilmDto createFilm(FilmDto filmDto) {
		Film film = filmMapper.toEntity(filmDto);
		if (StringUtils.isEmpty(film.getId())) {
			film.setId(UUID.randomUUID().toString());
		}
		filmRepository.save(film);
		return filmMapper.toDto(film);
	}

	@Override
	public FilmDto updateFilm(FilmDto filmDto) {
		Film film = filmRepository.findById(filmDto.getId()).orElseThrow(() -> new NoSuchElementException(String.format("Film not found, id: %s", filmDto.getId())));
		film = filmMapper.toEntity(filmDto);
		filmRepository.save(film);
		return filmMapper.toDto(film);
	}

	@Override
	public void deleteFilm(String id) {
		filmRepository.deleteById(id);
	}
	
}
