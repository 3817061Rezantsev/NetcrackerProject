package com.netcracker.kinopoisk.review.impl.service;

import java.util.NoSuchElementException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.netcracker.kinopoisk.review.api.dto.RoleDto;
import com.netcracker.kinopoisk.review.api.service.ReviewRoleService;
import com.netcracker.kinopoisk.review.impl.db.RoleRepository;
import com.netcracker.kinopoisk.review.model.Role;


@Service
public class ReviewRoleServiceImpl implements ReviewRoleService {
	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private RoleMapper roleMapper;

	@Override
	public RoleDto getRole(String id) {
		Role role = roleRepository.findById(id)
				.orElseThrow(() -> new NoSuchElementException(String.format("Film not found, id: %s", id)));
		return roleMapper.toDto(role);
	}

	@Override
	public RoleDto createRole(RoleDto roleDto) {
		Role role = roleMapper.toEntity(roleDto);
		if (StringUtils.isEmpty(role.getId())) {
			role.setId(UUID.randomUUID().toString());
		}
		roleRepository.save(role);
		return roleMapper.toDto(role);
	}

	@Override
	public RoleDto updateRole(RoleDto roleDto) {
		Role role = roleRepository.findById(roleDto.getId()).orElseThrow(
				() -> new NoSuchElementException(String.format("Film not found, id: %s", roleDto.getId())));
		role = roleMapper.toEntity(roleDto);
		roleRepository.save(role);
		return roleMapper.toDto(role);
	}

	@Override
	public void deleteRole(String id) {
		roleRepository.deleteById(id);
	}

}
