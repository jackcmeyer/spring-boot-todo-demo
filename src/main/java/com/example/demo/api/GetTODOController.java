package com.example.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.TODODTO;
import com.example.demo.model.TODO;
import com.example.demo.service.TODOService;

@RestController
public class GetTODOController {
	
	@Autowired
	private TODOService todoService;
	
	@GetMapping(value = "/api/v1/todos/{id}")
	public ResponseEntity<TODODTO> getTODOByID(@PathVariable String id) {
		TODO todo = this.todoService.findById(id);
		TODODTO dto = new TODODTO(todo.getId(), todo.getDescription(), todo.getDueDate(), todo.getAssignee());
		return ResponseEntity.ok(dto);		
	}	
}
