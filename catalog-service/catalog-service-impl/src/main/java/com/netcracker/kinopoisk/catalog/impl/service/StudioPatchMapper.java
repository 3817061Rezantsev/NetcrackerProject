package com.netcracker.kinopoisk.catalog.impl.service;

import org.springframework.stereotype.Component;

import com.netcracker.kinopoisk.catalog.api.dto.StudioPatchDto;
import com.netcracker.kinopoisk.catalog.model.Studio;

@Component
public class StudioPatchMapper {

	public void patchEntity(Studio studio, StudioPatchDto studioDto) {
		if (studioDto.getName() != null) {
			studio.setName(studioDto.getName().get());
		}
		if (studioDto.getOwner() != null) {
			studio.setOwner(studioDto.getOwner().get());
		}
		if (studioDto.getLocation() != null) {
			studio.setLocation(studioDto.getLocation().get());
		}
	}
}
