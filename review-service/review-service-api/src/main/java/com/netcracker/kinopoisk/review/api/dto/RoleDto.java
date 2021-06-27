package com.netcracker.kinopoisk.review.api.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class RoleDto {
	private String id;
	@NotBlank
	@Size(min = 1, max = 45)
	private String role;
}
