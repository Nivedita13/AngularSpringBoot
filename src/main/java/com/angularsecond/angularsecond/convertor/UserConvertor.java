package com.angularsecond.angularsecond.convertor;

import java.util.stream.Collectors;

import com.angularsecond.angularsecond.dto.UserDto;
import com.angularsecond.angularsecond.entity.User;



public class UserConvertor {
	
	public static User dtoToEntity(UserDto userDto) {
		User user = new User();
		user.setUserName(userDto.getUserName());
		user.setId(userDto.getUserId());
		user.setSkills(userDto.getSkillsDto().stream().map(SkillConvertor::dtoToEntity).collect(Collectors.toList()));
		return user;
	}
	
	public static UserDto entityToDto(User user) {
		UserDto userDto = new UserDto();
		userDto.setUserId(user.getId());
		userDto.setUserName(user.getUserName());
		userDto.setSkillsDto(user.getSkills().stream().map(SkillConvertor::entityToDto).collect(Collectors.toList()));
		return userDto;
	}
		
}
