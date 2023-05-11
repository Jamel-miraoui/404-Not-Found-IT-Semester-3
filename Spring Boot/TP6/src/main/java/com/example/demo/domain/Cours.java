package com.example.demo.domain;

import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
 


@Entity
@Table(name="cours")
public class Cours
{
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private Long id;
private String nomcours;
private int duree;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getNomcours() {
	return nomcours;
}
public void setNomcours(String nomcours) {
	this.nomcours = nomcours;
}
public int getDuree() {
	return duree;
}
public void setDuree(int duree) {
	this.duree = duree;
}
public Cours(Long id, String nomcours, int duree) {
	super();
	this.id = id;
	this.nomcours = nomcours;
	this.duree = duree;
}
public Cours() {
	super();
}
 
}

