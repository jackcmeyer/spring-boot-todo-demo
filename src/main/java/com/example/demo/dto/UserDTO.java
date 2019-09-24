package com.example.demo.dto;

public class UserDTO {
	private String id;
	private String name;
	
	public UserDTO() {
		
	}
	
	public UserDTO(String id, String name) {
		this.setId(id);
		this.name = name;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
