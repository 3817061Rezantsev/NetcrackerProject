package com.netcracker.kinopoisk.review.impl.service;

import org.mapstruct.Mapper;

import com.netcracker.kinopoisk.review.api.dto.CommentDto;
import com.netcracker.kinopoisk.review.model.Comment;


@Mapper(uses = { UserMapper.class, ReviewMapper.class }, componentModel = "spring")
public interface CommentMapper {
	CommentDto toDto(Comment comment);

	Comment toEntity(CommentDto commentDto);
}
