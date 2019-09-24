package com.example.demo.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDTO;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
public class GetUsersController {
	
	private UserService userService;

	public GetUsersController(UserService userService) {
		this.userService = userService;
	}
	
	
	@GetMapping(value = "/api/v1/users")
	public ResponseEntity<List<UserDTO>> getUsers() {
		List<UserDTO> dtos = new ArrayList<>();
		
		List<User> users = this.userService.findAll();
		
		users.forEach(user-> {
			UserDTO dto = new UserDTO(user.getId(), user.getName());
			dtos.add(dto);
		});
		return ResponseEntity.ok(dtos);
	}
}