package com.netcracker.kinopoisk.review.impl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.netcracker.kinopoisk.review.api.dto.CommentPatchDto;
import com.netcracker.kinopoisk.review.model.Comment;

@Component
public class CommentPatchMapper {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private ReviewMapper reviewMapper;

	public void patchEntity(Comment comment, CommentPatchDto commentDto) {
		if (commentDto.getUser() != null) {
			comment.setUser(userMapper.toEntity(commentDto.getUser().get()));
		}
		if (commentDto.getReview() != null) {
			comment.setReview(reviewMapper.toEntity(commentDto.getReview().get()));
		}
		if (commentDto.getText() != null) {
			comment.setText(commentDto.getText().get());
		}
		
	}
}
