package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.User;

public interface UserRepository extends MongoRepository<User, Long> {
	
  

	User findByUsername(String username);


}
