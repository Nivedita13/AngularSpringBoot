package com.angularsecond.angularsecond.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	
	private String userName;
	
	@OneToMany
	private List<Skills> skills = new ArrayList<>();
	
	
	public User() {
		super();
	}

	public User(Long id, String userName, List<Skills> skills) {
		super();
		this.userId = id;
		this.userName = userName;
		this.skills = skills;
	}

	
	
	public User(String userName, List<Skills> skills) {
		super();
		this.userName = userName;
		this.skills = skills;
	}

	public Long getId() {
		return userId;
	}

	public void setId(Long id) {
		this.userId = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<Skills> getSkills() {
		return skills;
	}

	public void setSkills(List<Skills> skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", skills=" + skills + "]";
	}
	
}
