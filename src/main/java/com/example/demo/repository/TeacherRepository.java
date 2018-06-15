package com.example.demo.repository;

//import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Teacher;

@Transactional
public interface TeacherRepository extends CrudRepository<Teacher, Long> {

//	Teacher findByName(String name);
	
//	Iterable<Teacher> findByNameContaining(String name);
	
}
