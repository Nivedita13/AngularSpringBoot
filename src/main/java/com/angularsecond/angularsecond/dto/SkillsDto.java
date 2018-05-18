package com.angularsecond.angularsecond.dto;

public class SkillsDto {

	private Long skillId;
	private String skillName;
	
	
	public SkillsDto() {
		super();
	}
	
	public SkillsDto(Long skillId, String skillName) {
		super();
		this.skillId = skillId;
		this.skillName = skillName;
	}
	

	public Long getSkillId() {
		return skillId;
	}

	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

}
