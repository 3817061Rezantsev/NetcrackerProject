package com.netcracker.kinopoisk.review.api.dto;

import lombok.Data;

@Data
public class CommentDto {
	private String id;
	private UserDto userId;
	private ReviewDto reviewId;
	private String text;
}
