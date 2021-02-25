package com.netcracker.kinopoisk.catalog.api.dto;

import lombok.Data;

@Data
public class ErrorDto {
	private String code;
	private String message;
}
