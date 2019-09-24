package com.example.demo.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CreateTODODTO;
import com.example.demo.dto.TODODTO;
import com.example.demo.model.TODO;
import com.example.demo.service.TODOService;

@RestController
public class PostTODOSController {
	private TODOService todoService;


	PostTODOSController(TODOService todoRepository) {
		this.todoService = todoRepository;
	}

	
	@PostMapping(value = "/api/v1/todos")
	public ResponseEntity<TODODTO> postTODO(@RequestBody CreateTODODTO dto) {
		TODO newTODO = this.todoService.createTODO(dto);
		TODODTO newDTO = new TODODTO(newTODO.getId(), newTODO.getDescription(), newTODO.getDueDate(), newTODO.getAssignee());
		return ResponseEntity.ok(newDTO);
	}
}
