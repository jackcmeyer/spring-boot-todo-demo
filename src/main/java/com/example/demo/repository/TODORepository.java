package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.TODO;

@Repository
public interface TODORepository extends JpaRepository<TODO, String> {

}
