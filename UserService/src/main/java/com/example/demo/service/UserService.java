package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repo.UserRepository;

@Service
public class UserService {
	
	 @Autowired
	    private UserRepository userRepository;

	    @Autowired
	    private PasswordEncoder passwordEncoder;

	    public User registerUser(User newUser) {
	        // Check if the username or email is already taken
	        if (userRepository.findByUsername(newUser.getUsername()) != null) {
	            throw new RuntimeException("Username is already taken.");
	        }
	        // Hash the user's password before saving it
	        newUser.setPassword(passwordEncoder.encode(newUser.getPassword()));
	        return userRepository.save(newUser);
	    }

}
