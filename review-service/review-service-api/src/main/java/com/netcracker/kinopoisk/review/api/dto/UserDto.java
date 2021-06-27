package com.netcracker.kinopoisk.review.api.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class UserDto {
	private String id;
	@NotBlank
	@Size(min = 1, max = 45)
	private String firstName;
	@Size(min = 1, max = 45)
	private String lastName;
	@Email
	private String email;
	private String passwordHash;
	private Boolean locked;
	private RoleDto role;
}
