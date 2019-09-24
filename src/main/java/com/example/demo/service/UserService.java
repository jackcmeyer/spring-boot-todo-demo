package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.CreateTODODTO;
import com.example.demo.dto.CreateUserDTO;
import com.example.demo.model.TODO;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public User createUser(CreateUserDTO dto) {
		User user = new User(dto.getName());
		User newUser = this.userRepository.save(user);
		return newUser;
	}
	
	public List<User> findAll() {
		return this.userRepository.findAll();
	}
}