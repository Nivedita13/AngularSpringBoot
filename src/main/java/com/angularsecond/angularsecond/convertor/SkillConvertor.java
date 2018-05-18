package com.angularsecond.angularsecond.convertor;

import com.angularsecond.angularsecond.dto.SkillsDto;
import com.angularsecond.angularsecond.entity.Skills;

public class SkillConvertor {
	
	public static Skills dtoToEntity(SkillsDto skillDto) {
		Skills skills = new Skills();
		skills.setSkillName(skillDto.getSkillName());
		skills.setSkillId(skillDto.getSkillId());
		return skills;	
	}
	
	public static SkillsDto entityToDto(Skills skills) {
		return new 	SkillsDto(skills.getSkillId(),skills.getSkillName());
	}
	
}
