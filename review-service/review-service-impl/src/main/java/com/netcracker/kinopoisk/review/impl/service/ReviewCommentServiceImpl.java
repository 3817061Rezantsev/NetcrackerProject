package com.netcracker.kinopoisk.review.impl.service;

import java.util.NoSuchElementException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.netcracker.kinopoisk.review.api.dto.CommentDto;
import com.netcracker.kinopoisk.review.api.service.ReviewCommentService;
import com.netcracker.kinopoisk.review.impl.db.CommentRepository;
import com.netcracker.kinopoisk.review.model.Comment;


@Service
public class ReviewCommentServiceImpl implements ReviewCommentService {
	@Autowired
	private CommentRepository commentRepository;
	@Autowired
	private CommentMapper commentMapper;


	@Override
	public CommentDto getComment(String id) {
		Comment comment = commentRepository.findById(id).orElseThrow(() -> new NoSuchElementException(String.format("Film not found, id: %s", id)));
		return commentMapper.toDto(comment);
	}

	@Override
	public CommentDto createComment(CommentDto commentDto) {
		Comment comment = commentMapper.toEntity(commentDto);
		if (StringUtils.isEmpty(comment.getId())) {
			comment.setId(UUID.randomUUID().toString());
		}
		commentRepository.save(comment);
		return commentMapper.toDto(comment);
	}

	@Override
	public CommentDto updateComment(CommentDto commentDto) {
		Comment comment = commentRepository.findById(commentDto.getId()).orElseThrow(() -> new NoSuchElementException(String.format("Film not found, id: %s", commentDto.getId())));
		comment = commentMapper.toEntity(commentDto);
		commentRepository.save(comment);
		return commentMapper.toDto(comment);
	}

	@Override
	public void deleteComment(String id) {
		commentRepository.deleteById(id);
		
	}

}
