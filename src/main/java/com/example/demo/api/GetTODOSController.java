package com.example.demo.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.TODODTO;
import com.example.demo.model.TODO;
import com.example.demo.service.TODOService;

@RestController
public class GetTODOSController {

	private TODOService todoService;


	GetTODOSController(TODOService todoService) {
		this.todoService = todoService;
	}
	
	
	@GetMapping(value = "/api/v1/todos")
	public ResponseEntity<List<TODODTO>> getTODOS() {
		List<TODODTO> dtos = new ArrayList<>();
		
		List<TODO> todos = this.todoService.findAll();
		
		todos.forEach(todo -> {
			TODODTO dto = new TODODTO(todo.getId(), todo.getDescription(), todo.getDueDate(), todo.getAssignee());
			dtos.add(dto);
		});
		
		
		return ResponseEntity.ok(dtos);	
	}
}
