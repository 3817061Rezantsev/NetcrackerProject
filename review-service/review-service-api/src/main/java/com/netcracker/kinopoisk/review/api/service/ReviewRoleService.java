package com.netcracker.kinopoisk.review.api.service;

import com.netcracker.kinopoisk.review.api.dto.RoleDto;

public interface ReviewRoleService {

	RoleDto getReview(String id);

	RoleDto createReview(RoleDto roleDto);
	
	RoleDto updateReview(RoleDto roleDto);
	
	void deleteReview(String id);
}
