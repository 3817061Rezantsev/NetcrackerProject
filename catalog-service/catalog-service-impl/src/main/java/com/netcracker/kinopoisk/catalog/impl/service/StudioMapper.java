package com.netcracker.kinopoisk.catalog.impl.service;

import org.mapstruct.Mapper;

import com.netcracker.kinopoisk.catalog.api.dto.StudioDto;
import com.netcracker.kinopoisk.catalog.model.Studio;

@Mapper(componentModel = "spring")
public interface StudioMapper {
	StudioDto toDto(Studio studio);

	Studio toEntity(StudioDto studioDto);
}
