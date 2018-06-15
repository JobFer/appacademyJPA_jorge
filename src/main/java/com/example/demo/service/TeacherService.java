package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Teacher;
import com.example.demo.repository.TeacherRepository;

@Service
public class TeacherService implements ITeacherService {

	@Autowired
	private TeacherRepository teacherRepository;
	
//	private static List<Teacher> LIST_TEACHER=new  ArrayList<>();
//	
//	static{
//		LIST_TEACHER.add(new Teacher(1L, "Henry Mendoza Puerta"));
//		LIST_TEACHER.add(new Teacher(2L, "Patricia Plasencia Burgos"));
//	}
	
	@Override
	public Iterable<Teacher> findAll() {
//		return TeacherService.LIST_TEACHER;
		return teacherRepository.findAll();
	}

	@Override
	public void save(Teacher teacher) {
//		TeacherService.LIST_TEACHER.add(teacher);
		teacherRepository.save(teacher);
	}

//	@Override
//	public Teacher findOne(Long id) {
//		return teacherRepository.findOne(id);
//	}

//	@Override
//	public void delete(Long id) {
//		teacherRepository.delete(id);
//	}

//	@Override
//	public Teacher findByName(String name) {
//		return teacherRepository.findByName(name);
//	}

//	@Override
//	public Iterable<Teacher> findByNameContaining(String name) {
//		return teacherRepository.findByNameContaining(name);
//	}

}