package com.netcracker.kinopoisk.review.impl.service;

import org.mapstruct.Mapper;

import com.netcracker.kinopoisk.review.api.dto.UserDto;
import com.netcracker.kinopoisk.review.model.User;

@Mapper(uses = { RoleMapper.class }, componentModel = "spring")
public interface UserMapper {
	UserDto toDto(User user);

	User toEntity(UserDto userDto);
}
