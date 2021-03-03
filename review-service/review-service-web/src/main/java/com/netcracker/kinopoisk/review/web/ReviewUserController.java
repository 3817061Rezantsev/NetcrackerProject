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

import com.netcracker.kinopoisk.review.api.dto.UserDto;
import com.netcracker.kinopoisk.review.api.service.ReviewUserService;

@RestController
@RequestMapping(value = "/review")
public class ReviewUserController {
	@Autowired
	private ReviewUserService reviewUserService;

	@GetMapping("/user/{id}")
	public UserDto getFilm(@PathVariable("id") String id) {
		return reviewUserService.getUser(id);
	}

	@PostMapping("/user")
	public UserDto createFilm(@RequestBody UserDto userDto) {
		return reviewUserService.createUser(userDto);
	}

	@PutMapping("/user")
	public UserDto updateFilm(@RequestBody UserDto userDto) {
		return reviewUserService.updateUser(userDto);
	}

	@DeleteMapping("/user/{id}")
	public void deleteFilm(@PathVariable("id") String id) {
		reviewUserService.deleteUser(id);
	}
}
