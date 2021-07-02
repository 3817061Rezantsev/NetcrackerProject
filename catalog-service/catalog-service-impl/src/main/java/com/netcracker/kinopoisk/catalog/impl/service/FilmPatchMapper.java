package com.netcracker.kinopoisk.catalog.impl.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.netcracker.kinopoisk.catalog.api.dto.ActorDto;
import com.netcracker.kinopoisk.catalog.api.dto.FilmPatchDto;
import com.netcracker.kinopoisk.catalog.api.dto.GenreDto;
import com.netcracker.kinopoisk.catalog.model.Film;
import com.netcracker.kinopoisk.catalog.model.Genre;
import com.netcracker.kinopoisk.catalog.model.Person;

@Component
public class FilmPatchMapper {

	@Autowired
	private StudioMapper studioMapper;
	@Autowired
	private PersonMapper personMapper;

	public void patchEntity(Film film, FilmPatchDto filmDto) {
		if (filmDto.getName() != null) {
			film.setName(filmDto.getName().get());
		}
		if (filmDto.getStudio() != null) {
			film.setStudio(studioMapper.toEntity(filmDto.getStudio().get()));
		}
		if (filmDto.getActors() != null) {
			film.setActors(actorDtoListToPersonList(filmDto.getActors().get()));
		}
		if (filmDto.getProducer() != null) {
			film.setProducer(personMapper.toEntity(filmDto.getProducer().get()));
		}
		if (filmDto.getScore() != null) {
			film.setScore(filmDto.getScore().get());
		}
		if (filmDto.getViews() != null) {
			film.setViews(filmDto.getViews().get());
		}
		if (filmDto.getExternalId() != null) {
			film.setExternalId(filmDto.getExternalId().get());
		}
		if (filmDto.getGenres() != null) {
			film.setGenres(genreDtoListToGenreList(filmDto.getGenres().get()));
		}
	}

	protected List<Person> actorDtoListToPersonList(List<ActorDto> list) {
		if (list == null) {
			return null;
		}

		List<Person> list1 = new ArrayList<Person>(list.size());
		for (ActorDto actorDto : list) {
			list1.add(personMapper.toEntity(actorDto));
		}

		return list1;
	}
	
	protected Genre genreDtoToGenre(GenreDto genreDto) {
        if ( genreDto == null ) {
            return null;
        }

        Genre genre = new Genre();

        genre.setId( genreDto.getId() );
        genre.setGenreName( genreDto.getGenreName() );

        return genre;
    }

    protected List<Genre> genreDtoListToGenreList(List<GenreDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Genre> list1 = new ArrayList<Genre>( list.size() );
        for ( GenreDto genreDto : list ) {
            list1.add( genreDtoToGenre( genreDto ) );
        }

        return list1;
    }

}
