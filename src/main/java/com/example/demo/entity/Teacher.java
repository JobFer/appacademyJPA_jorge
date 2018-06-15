package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

@Entity
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="SEQ_TEACHER")
	
//	@Range(min=5,max=15, message="El id tiene que estar entre {min} y {max}")
	@Min(value=5,message="El mínimo del campo id es {value}")
	private Long id;

	@Size(min = 4, max = 20, message = "El nombre debe tener mas de {min} letras y menos de {max}")
	private String name;

	public Teacher() {
	}

//	public Teacher(Long id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + "]";
	}
	
	

}