package com.netcracker.kinopoisk.review.api.service;

import com.netcracker.kinopoisk.review.api.dto.CommentDto;

public interface ReviewCommentService {
	CommentDto getComment(String id);

	CommentDto createComment(CommentDto commentDto);

	CommentDto updateComment(CommentDto commentDto);
	
	void deleteComment(String id);

}
