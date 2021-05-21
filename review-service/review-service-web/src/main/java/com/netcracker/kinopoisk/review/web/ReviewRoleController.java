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

import com.netcracker.kinopoisk.review.api.dto.RoleDto;
import com.netcracker.kinopoisk.review.api.service.ReviewRoleService;

@RestController
@RequestMapping(value = "/review")
public class ReviewRoleController {
	@Autowired
	private ReviewRoleService reviewRoleService;

	@GetMapping("/role/{id}")
	public RoleDto getRole(@PathVariable("id") String id) {
		return reviewRoleService.getRole(id);
	}

	@PostMapping("/role")
	public RoleDto createRole(@RequestBody RoleDto roleDto) {
		return reviewRoleService.createRole(roleDto);
	}

	@PutMapping("/role")
	public RoleDto updateRole(@RequestBody RoleDto roleDto) {
		return reviewRoleService.updateRole(roleDto);
	}

	@DeleteMapping("/role/{id}")
	public void deleteRole(@PathVariable("id") String id) {
		reviewRoleService.deleteRole(id);
	}
}
