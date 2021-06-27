package com.netcracker.kinopoisk.catalog.api.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class StudioDto {
	private String id;
	@NotBlank
	@Size(min = 1, max = 45)
	private String name;
	private String owner;
	private String location;
}
