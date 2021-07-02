package com.netcracker.kinopoisk.review.impl.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.netcracker.kinopoisk.review.api.dto.ReviewPatchDto;
import com.netcracker.kinopoisk.review.api.dto.UserPatchDto;
import com.netcracker.kinopoisk.review.model.Review;
import com.netcracker.kinopoisk.review.model.User;

public class UserPatchMapper {
	@Autowired
	private RoleMapper roleMapper;

	public void patchEntity(User user, UserPatchDto userDto) {
		if (userDto.getRole() != null) {
			user.setRole(roleMapper.toEntity(userDto.getRole().get()));
		}
		if (userDto.getFirstName() != null) {
			user.setFirstName(userDto.getFirstName().get());
		}
		if (userDto.getLastName() != null) {
			user.setLastName(userDto.getLastName().get());
		}
		if (userDto.getEmail() != null) {
			user.setEmail(userDto.getEmail().get());
		}
		if (userDto.getPasswordHash() != null) {
			user.setPasswordHash(userDto.getPasswordHash().get());
		}
		if (userDto.getLocked() != null) {
			user.setLocked(userDto.getLocked().get());
		}
	}

}
