package com.angularsecond.angularsecond;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.angularsecond.angularsecond.entity.Skills;
import com.angularsecond.angularsecond.entity.User;
import com.angularsecond.angularsecond.repo.SkillRepo;
import com.angularsecond.angularsecond.repo.UserRepo;

@Component
public class SeedDb implements CommandLineRunner{

	public SeedDb() {
		super();
	}
	
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	SkillRepo skillRepo;

	@Override
	public void run(String... args) throws Exception {
		Skills skills = new Skills("Arts", null);
		User user = new User("Nivi", null);
		System.out.println(user);
		
		skillRepo.save(skills);
	
		user.setSkills(Arrays.asList(skills));
		userRepo.save(user);
		
		skills.setUser(user);
		skillRepo.save(skills);
		
	
		
//		userRepo.save(user);
//		
//		skills.setUser(user);
//		skillRepo.save(skills);
//		
//		user.setSkills(Arrays.asList(skills));
//		userRepo.save(user);
	}
	
	
}
