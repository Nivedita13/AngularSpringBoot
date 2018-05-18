package com.angularsecond.angularsecond.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.angularsecond.angularsecond.dto.UserDto;

@Service
public interface UserService {
	
	public List<UserDto> getAllUsers();

	public void saveUser(UserDto userDto);
	
}
