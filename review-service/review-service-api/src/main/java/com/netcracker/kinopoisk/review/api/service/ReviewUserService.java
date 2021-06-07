package com.netcracker.kinopoisk.review.api.service;

import com.netcracker.kinopoisk.review.api.dto.UserDto;
import com.netcracker.kinopoisk.review.model.User;

public interface ReviewUserService {
	UserDto getUser(String id);

	UserDto createUser(UserDto userDto);
	
	UserDto updateUser(UserDto userDto);
	
	void deleteUser(String id);

	User findByUsername(String username);
}
