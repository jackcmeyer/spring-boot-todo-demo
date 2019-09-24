package com.example.demo.dto;

import java.util.Date;

public class CreateTODODTO {

	
	
	private String description;
	private Date dueDate;
	private String assignee;
	
	
	public CreateTODODTO() {
		// empty
	}
	
	
	public CreateTODODTO(String description, Date dueDate, String assignee) {
		this.description = description;
		this.dueDate = dueDate;
		this.assignee = assignee;
	}


	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public String getAssignee() {
		return assignee;
	}
	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}
	
	
	
}
