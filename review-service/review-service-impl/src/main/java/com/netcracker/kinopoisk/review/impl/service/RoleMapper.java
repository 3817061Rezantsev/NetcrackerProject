package com.netcracker.kinopoisk.review.impl.service;

import org.mapstruct.Mapper;

import com.netcracker.kinopoisk.review.api.dto.RoleDto;
import com.netcracker.kinopoisk.review.model.Role;

@Mapper(componentModel = "spring")
public interface RoleMapper {
	RoleDto toDto(Role role);

	Role toEntity(RoleDto roleDto);
}
