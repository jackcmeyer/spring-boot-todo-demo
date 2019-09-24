package com.example.demo.dto;

import java.util.Date;

public class TODODTO {

	private String id;
	private String description;
	private Date dueDate;
	private String assignee;
	
	public TODODTO() {
		// empty constructor
	}
	
	
	public TODODTO(String id, String description, Date dueDate, String assignee) {
		this.setId(id);
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


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}	
}
