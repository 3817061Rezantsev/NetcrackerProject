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

import com.netcracker.kinopoisk.catalog.api.dto.StudioDto;
import com.netcracker.kinopoisk.catalog.api.dto.StudioPatchDto;
import com.netcracker.kinopoisk.catalog.api.service.CatalogService;

@RestController
@RequestMapping(value = "/catalog")
public class CatalogStudioController {
	@Autowired
	private CatalogService catalogService;
	
	@GetMapping("/studio/{id}")
	public StudioDto getStudio(@PathVariable("id") String id) {
		return catalogService.getStudio(id);
	}

	@PostMapping("/studio")
	public StudioDto createStudio(@RequestBody StudioDto studioDto) {
		return catalogService.createStudio(studioDto);
	}

	@PutMapping("/studio")
	public StudioDto updateStudio(@RequestBody StudioPatchDto studioDto) {
		return catalogService.updateStudio(studioDto);
	}

	@DeleteMapping("/studio/{id}")
	public void deleteStudio(@PathVariable("id") String id) {
		catalogService.deleteStudio(id);
	}
}
