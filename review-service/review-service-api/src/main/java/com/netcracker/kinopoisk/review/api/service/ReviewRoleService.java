package com.netcracker.kinopoisk.review.api.service;

import com.netcracker.kinopoisk.review.api.dto.RoleDto;

public interface ReviewRoleService {

	RoleDto getRole(String id);

	RoleDto createRole(RoleDto roleDto);
	
	RoleDto updateRole(RoleDto roleDto);
	
	void deleteRole(String id);
}
