package com.angularsecond.angularsecond.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.angularsecond.angularsecond.entity.Skills;

@Repository
public interface SkillRepo extends JpaRepository<Skills, Long>{

}
