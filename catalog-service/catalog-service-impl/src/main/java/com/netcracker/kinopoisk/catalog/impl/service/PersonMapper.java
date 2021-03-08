package com.netcracker.kinopoisk.catalog.impl.service;

import org.mapstruct.Mapper;

import com.netcracker.kinopoisk.catalog.api.dto.ActorDto;
import com.netcracker.kinopoisk.catalog.api.dto.PersonDto;
import com.netcracker.kinopoisk.catalog.api.dto.ProducerDto;
import com.netcracker.kinopoisk.catalog.model.Person;

@Mapper(componentModel = "spring")
public interface PersonMapper {
	PersonDto toDto(Person person);

	Person toEntity(PersonDto personDto);

	ActorDto toActorDto(Person person);

	Person toEntity(ActorDto actorDto);

	ProducerDto toProducerDto(Person person);

	Person toEntity(ProducerDto actorDto);
}
