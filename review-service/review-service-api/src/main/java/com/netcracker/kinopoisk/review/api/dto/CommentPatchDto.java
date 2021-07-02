package com.netcracker.kinopoisk.review.api.dto;

import java.util.Optional;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class CommentPatchDto {
	private String id;
	private Optional<UserDto> user;
	private Optional<ReviewDto> review;
	@NotBlank
	@Size(min = 1, max = 45)
	private Optional<String> text;
}
