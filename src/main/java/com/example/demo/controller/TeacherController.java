package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Teacher;
import com.example.demo.service.ITeacherService;

@Controller
@RequestMapping("/")
public class TeacherController {

	@Autowired
	private ITeacherService teacherService;
	
	
	@GetMapping("/teachers")
	public String findAll(Model model){
		model.addAttribute("teachers", teacherService.findAll());
		model.addAttribute("teacher",new Teacher());
		return "Teacher";
	}
	
	
	@PostMapping("/teachers")
//	public String save(@ModelAttribute("teacher") @Valid Teacher teacher, BindingResult result, Model model){
	public String save(@Valid Teacher teacher, BindingResult result, Model model){
		
		if(result.hasErrors()){
			model.addAttribute("teachers", teacherService.findAll());
			return "Teacher"; //Directo a la vista
		}
		this.teacherService.save(teacher);
		return "redirect:/teachers"; //Por GET
	}
	
	@GetMapping("/")
	public String homePage() {
		System.out.println("voy a index");
		return "index";
	}		
}