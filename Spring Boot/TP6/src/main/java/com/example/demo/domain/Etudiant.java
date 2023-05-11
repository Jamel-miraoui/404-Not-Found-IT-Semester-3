package com.example.demo.domain;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="etudiant")
public class Etudiant {
 
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String nometd;
private int cours;
private int frais;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getNometd() {
	return nometd;
}
public void setNometd(String nometd) {
	this.nometd = nometd;
}
public int getCours() {
	return cours;
}
public void setCours(int cours) {
	this.cours = cours;
}
public int getFrais() {
	return frais;
}
public void setFrais(int frais) {
	this.frais = frais;
}
public Etudiant(Long id, String nometd, int cours, int frais) {
	super();
	this.id = id;
	this.nometd = nometd;
	this.cours = cours;
	this.frais = frais;
}
public Etudiant() {
	super();
}}