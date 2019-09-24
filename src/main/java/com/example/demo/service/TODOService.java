package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.CreateTODODTO;
import com.example.demo.model.TODO;
import com.example.demo.repository.TODORepository;

@Service
public class TODOService {

	private TODORepository todoRepository;

	public TODOService(TODORepository todoRepository) {
		this.todoRepository = todoRepository;
	}
	
	
	public TODO createTODO(CreateTODODTO dto) {
		TODO todo = new TODO(dto.getDescription(), new java.sql.Date(dto.getDueDate().getTime()), dto.getAssignee());
		TODO newTODO = this.todoRepository.save(todo);
		return newTODO;
	}
	
	public List<TODO> findAll() {
		return this.todoRepository.findAll();
	}
	
	
	public TODO findById(String id) {
		return this.todoRepository.findById(id).get();
	}
}
