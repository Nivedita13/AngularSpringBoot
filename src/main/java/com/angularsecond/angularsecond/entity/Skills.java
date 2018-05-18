package com.angularsecond.angularsecond.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Skills {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long skillId;
	
	private String skillName;
	
	@ManyToOne
	private User user;

	public Skills() {
		super();
	}

	public Skills(Long skillId, String skillName, User user) {
		super();
		this.skillId = skillId;
		this.skillName = skillName;
		this.user = user;
	}

	
	
	public Skills(String skillName, User user) {
		super();
		this.skillName = skillName;
		this.user = user;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Skills [skillId=" + skillId + ", skillName=" + skillName + ", user=" + user + "]";
	}
	
	
	
}
