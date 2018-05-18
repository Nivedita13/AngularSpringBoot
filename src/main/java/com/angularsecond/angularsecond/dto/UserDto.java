package com.angularsecond.angularsecond.dto;

import java.util.ArrayList;
import java.util.List;

public class UserDto {

	private Long userId;
	private String userName;
	
	private List<SkillsDto> skillsDto = new ArrayList<>();

	public UserDto() {
		super();
	}

	public UserDto(Long userId, String userName, List<SkillsDto> skillsDto) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.skillsDto = skillsDto;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<SkillsDto> getSkillsDto() {
		return skillsDto;
	}

	public void setSkillsDto(List<SkillsDto> skillsDto) {
		this.skillsDto = skillsDto;
	}
	
}
