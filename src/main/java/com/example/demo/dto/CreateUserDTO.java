package com.example.demo.dto;

public class CreateUserDTO {
	private String name;

	public CreateUserDTO() {
		
	}
	
	public CreateUserDTO(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
