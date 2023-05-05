package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Etudiant {
@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String etudiantname;
	private String parcours;
	private int age;
	
	public Etudiant() {
		super();
	}
	public Etudiant(Long id, String etudiantname, String parcours, int age) {
		super();
		this.id = id;
		this.etudiantname = etudiantname;
		this.parcours = parcours;
		this.age = age;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEtudiantname() {
		return etudiantname;
	}
	public void setEtudiantname(String etudiantname) {
		this.etudiantname = etudiantname;
	}
	public String getParcours() {
		return parcours;
	}
	public void setParcours(String parcours) {
		this.parcours = parcours;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
