package com.example.demo.service;

import com.example.demo.entity.Teacher;

public interface ITeacherService {

//	public List<Teacher> findAll();
	public Iterable<Teacher> findAll();

	public void save(Teacher teacher);
	
//	public Teacher findOne(Long id);
//	
//	public void delete(Long id);
//	
//	public Teacher findByName(String name);
//	
//	public Iterable<Teacher> findByNameContaining(String name);
	
}