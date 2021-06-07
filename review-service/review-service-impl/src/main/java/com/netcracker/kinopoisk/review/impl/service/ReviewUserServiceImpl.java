package com.netcracker.kinopoisk.review.impl.service;

import java.util.NoSuchElementException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.netcracker.kinopoisk.review.api.dto.UserDto;
import com.netcracker.kinopoisk.review.api.service.ReviewUserService;
import com.netcracker.kinopoisk.review.impl.db.UserRepository;
import com.netcracker.kinopoisk.review.model.User;

@Service
public class ReviewUserServiceImpl implements ReviewUserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private UserMapper userMapper;

	@Override
	public UserDto getUser(String id) {
		User user = userRepository.findById(id)
				.orElseThrow(() -> new NoSuchElementException(String.format("Film not found, id: %s", id)));
		return userMapper.toDto(user);
	}

	@Override
	public UserDto createUser(UserDto userDto) {
		User user = userMapper.toEntity(userDto);
		if (StringUtils.isEmpty(user.getId())) {
			user.setId(UUID.randomUUID().toString());
		}
		userRepository.save(user);
		return userMapper.toDto(user);
	}

	@Override
	public UserDto updateUser(UserDto userDto) {
		User user = userRepository.findById(userDto.getId()).orElseThrow(
				() -> new NoSuchElementException(String.format("Film not found, id: %s", userDto.getId())));
		user = userMapper.toEntity(userDto);
		userRepository.save(user);
		return userMapper.toDto(user);
	}

	@Override
	public void deleteUser(String id) {
		userRepository.deleteById(id);
	}

	@Override
	public User findByUsername(String username) {
		User result = userRepository.findByEmail(username);
        
        return result;
	}
}
