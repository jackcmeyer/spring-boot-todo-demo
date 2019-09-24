package com.example.demo.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CreateUserDTO;
import com.example.demo.dto.UserDTO;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
public class PostUsersController {
	private UserService userService;
	
	PostUsersController(UserService userRepository) {
		this.userService = userRepository;
	}
	
	@PostMapping(value = "/api/v1/users")
	public ResponseEntity<UserDTO> postUser(@RequestBody CreateUserDTO dto) {
		User newUser = this.userService.createUser(dto);
		UserDTO newDTO = new UserDTO(newUser.getId(), newUser.getName());
		return ResponseEntity.ok(newDTO);
		
	}
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
