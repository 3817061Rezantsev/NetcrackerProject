package com.netcracker.kinopoisk.review.api.dto;

import java.util.Optional;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;
@Data
public class UserPatchDto {
	private String id;
	@NotBlank
	@Size(min = 1, max = 45)
	private Optional<String> firstName;
	@Size(min = 1, max = 45)
	private Optional<String> lastName;
	@Email
	private Optional<String> email;
	private Optional<String> passwordHash;
	private Optional<Boolean> locked;
	private Optional<RoleDto> role;
}
