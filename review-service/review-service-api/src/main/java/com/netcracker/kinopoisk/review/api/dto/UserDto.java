package com.netcracker.kinopoisk.review.api.dto;

import lombok.Data;

@Data
public class UserDto {
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private String passwordHash;
	private Boolean locked;
	private RoleDto role;
}
