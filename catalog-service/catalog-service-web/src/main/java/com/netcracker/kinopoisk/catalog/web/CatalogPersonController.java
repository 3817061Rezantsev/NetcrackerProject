package com.netcracker.kinopoisk.catalog.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netcracker.kinopoisk.catalog.api.dto.PersonDto;
import com.netcracker.kinopoisk.catalog.api.service.CatalogService;

@RestController
@RequestMapping(value = "/catalog")
public class CatalogPersonController {
	@Autowired
	private CatalogService catalogService;
	
	@GetMapping("/person/{id}")
	public PersonDto getPerson(@PathVariable("id") String id) {
		return catalogService.getPerson(id);
	}

	@PostMapping("/person")
	public PersonDto createPerson(@RequestBody PersonDto personDto) {
		return catalogService.createPerson(personDto);
	}

	@PutMapping("/person")
	public PersonDto updatePerson(@RequestBody PersonDto personDto) {
		return catalogService.updatePerson(personDto);
	}

	@DeleteMapping("/person/{id}")
	public void deletePerson(@PathVariable("id") String id) {
		catalogService.deletePerson(id);
	}
}
