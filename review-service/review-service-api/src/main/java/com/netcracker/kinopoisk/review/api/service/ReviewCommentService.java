package com.netcracker.kinopoisk.review.api.service;

import com.netcracker.kinopoisk.review.api.dto.CommentDto;
import com.netcracker.kinopoisk.review.api.dto.CommentPatchDto;

public interface ReviewCommentService {
	CommentDto getComment(String id);

	CommentDto createComment(CommentDto commentDto);

	CommentDto updateComment(CommentPatchDto commentDto);
	
	void deleteComment(String id);

}
