package com.netcracker.kinopoisk.catalog.impl.service;

import org.springframework.stereotype.Component;

import com.netcracker.kinopoisk.catalog.api.dto.PersonPatchDto;
import com.netcracker.kinopoisk.catalog.model.Person;

@Component
public class PersonPatchMapper {

	public void patchEntity(Person person, PersonPatchDto personDto) {
		if (personDto.getFirstName() != null) {
			person.setFirstName(personDto.getFirstName().get());
		}
		if (personDto.getLastName() != null) {
			person.setLastName(personDto.getLastName().get());
		}
	}

}
