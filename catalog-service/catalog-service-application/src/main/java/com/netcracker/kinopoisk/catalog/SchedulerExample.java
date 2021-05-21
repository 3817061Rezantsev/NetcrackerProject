package com.netcracker.kinopoisk.catalog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.netcracker.kinopoisk.catalog.api.dto.MovieDbFilmDto;
import com.netcracker.kinopoisk.catalog.impl.db.FilmRepository;
import com.netcracker.kinopoisk.catalog.model.Film;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class SchedulerExample {

	@Autowired
	FilmRepository filmRepository;

	@Scheduled(fixedRate = 1000000)
	public void reportCurrentData() {
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl = "https://api.themoviedb.org/3/movie/latest?api_key=e710e0a1ac2eb6aa4a2f55251405cabb";
		MovieDbFilmDto mFilm = restTemplate.getForObject(fooResourceUrl, MovieDbFilmDto.class);
		Film film = filmRepository.findByExternalId(mFilm.getId());
		if (film == null) {
			film = new Film();
			film.setName(mFilm.getTitle());
			film.setExternalId(mFilm.getId());
			filmRepository.save(film);
		}
		log.info("Scheduler working: " + mFilm.getId() + " " + mFilm.getTitle());

	}
}
