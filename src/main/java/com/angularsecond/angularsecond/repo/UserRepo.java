package com.angularsecond.angularsecond.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.angularsecond.angularsecond.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{

}
