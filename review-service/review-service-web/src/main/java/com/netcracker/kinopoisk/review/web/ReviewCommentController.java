package com.netcracker.kinopoisk.review.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netcracker.kinopoisk.review.api.dto.CommentDto;
import com.netcracker.kinopoisk.review.api.dto.FilmDto;
import com.netcracker.kinopoisk.review.api.service.ReviewCommentService;

@RestController
@RequestMapping(value = "/review")
public class ReviewCommentController {
	@Autowired
	private ReviewCommentService reviewCommentService;

	@GetMapping("/comment/{id}")
	public CommentDto getComment(@PathVariable("id") String id) {
		return reviewCommentService.getComment(id);
	}

	@PostMapping("/comment")
	public CommentDto createComment(@RequestBody CommentDto commentDto) {
		return reviewCommentService.createComment(commentDto);
	}

	@PutMapping("/comment")
	public CommentDto updateComment(@RequestBody CommentDto commentDto) {
		return reviewCommentService.updateComment(commentDto);
	}

	@DeleteMapping("/comment/{id}")
	public void deleteComment(@PathVariable("id") String id) {
		reviewCommentService.deleteComment(id);
	}
}
