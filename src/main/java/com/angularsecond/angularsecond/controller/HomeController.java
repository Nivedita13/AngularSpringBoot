package com.angularsecond.angularsecond.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angularsecond.angularsecond.dto.UserDto;
import com.angularsecond.angularsecond.service.UserService;

@RestController
public class HomeController {
	
	@Autowired
	UserService userService;

	@RequestMapping({ "" , "/" })
	public String home() {
		return "Home Page";
	}
	
	@RequestMapping("/users")
	public List<UserDto> getUsers(){
		return userService.getAllUsers();
	}
	
	@PostMapping("/user")
	public void addUser(@RequestBody UserDto userDto) {
		userService.saveUser(userDto);
	}
}
