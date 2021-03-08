package com.netcracker.kinopoisk.catalog.impl.service;

import java.util.NoSuchElementException;
<<<<<<< HEAD
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.netcracker.kinopoisk.catalog.api.dto.FilmDto;
import com.netcracker.kinopoisk.catalog.api.dto.PersonDto;
import com.netcracker.kinopoisk.catalog.api.dto.StudioDto;
import com.netcracker.kinopoisk.catalog.api.service.CatalogService;
import com.netcracker.kinopoisk.catalog.impl.db.FilmRepository;
import com.netcracker.kinopoisk.catalog.impl.db.PeopleRepository;
import com.netcracker.kinopoisk.catalog.impl.db.StudioRepository;
import com.netcracker.kinopoisk.catalog.model.Film;
import com.netcracker.kinopoisk.catalog.model.Person;
import com.netcracker.kinopoisk.catalog.model.Studio;

@Service
public class CatalogServiceImpl implements CatalogService {
	@Autowired
	private FilmRepository filmRepository;
	@Autowired
	private FilmMapper filmMapper;
	@Autowired
	private StudioRepository studioRepository;
	@Autowired
	private StudioMapper studioMapper;
	@Autowired
	private PeopleRepository personRepository;
	@Autowired
	private PersonMapper personMapper;

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

	@Override
	public StudioDto getStudio(String id) {
		Studio studio = studioRepository.findById(id).orElseThrow(() -> new NoSuchElementException(String.format("Studio not found, id: %s", id)));
		return studioMapper.toDto(studio);
	}

	@Override
	public StudioDto createStudio(StudioDto studioDto) {
		Studio studio = studioMapper.toEntity(studioDto);
		if (StringUtils.isEmpty(studio.getId())) {
			studio.setId(UUID.randomUUID().toString());
		}
		studioRepository.save(studio);
		return studioMapper.toDto(studio);
	}

	@Override
	public StudioDto updateStudio(StudioDto studioDto) {
		Studio studio = studioRepository.findById(studioDto.getId()).orElseThrow(() -> new NoSuchElementException(String.format("Studio not found, id: %s", studioDto.getId())));
		studio = studioMapper.toEntity(studioDto);
		studioRepository.save(studio);
		return studioMapper.toDto(studio);
	}

	@Override
	public void deleteStudio(String id) {
		studioRepository.deleteById(id);
	}

	@Override
	public PersonDto getPerson(String id) {
		Person person = personRepository.findById(id).orElseThrow(() -> new NoSuchElementException(String.format("Person not found, id: %s", id)));
		return personMapper.toDto(person);
	}

	@Override
	public PersonDto createPerson(PersonDto personDto) {
		Person person = personMapper.toEntity(personDto);
		if (StringUtils.isEmpty(person.getId())) {
			person.setId(UUID.randomUUID().toString());
		}
		personRepository.save(person);
		return personMapper.toDto(person);
	}

	@Override
	public PersonDto updatePerson(PersonDto personDto) {
		Person person = personRepository.findById(personDto.getId()).orElseThrow(() -> new NoSuchElementException(String.format("Person not found, id: %s", personDto.getId())));
		person = personMapper.toEntity(personDto);
		personRepository.save(person);
		return personMapper.toDto(person);
	}

	@Override
	public void deletePerson(String id) {
		personRepository.deleteById(id);
=======

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
>>>>>>> refs/remotes/origin/main
	}

}
