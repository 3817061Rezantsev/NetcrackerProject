package com.netcracker.kinopoisk.catalog.api.dto;

import java.util.Optional;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class PersonPatchDto {
	private String id;
	@NotBlank
	@Size(min = 1, max = 45)
	private Optional<String> firstName;
	@Size(min = 1, max = 45)
	private Optional<String> lastName;
}
