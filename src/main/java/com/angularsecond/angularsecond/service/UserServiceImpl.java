package com.angularsecond.angularsecond.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angularsecond.angularsecond.convertor.UserConvertor;
import com.angularsecond.angularsecond.dto.UserDto;
import com.angularsecond.angularsecond.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepo userRepo;
	
	@Override
	public List<UserDto> getAllUsers() {
		return userRepo.findAll().stream().map(UserConvertor::entityToDto).collect(Collectors.toList());
	}

	@Override
	public void saveUser(UserDto userDto) {
		userRepo.save(UserConvertor.dtoToEntity(userDto));
	}

}
