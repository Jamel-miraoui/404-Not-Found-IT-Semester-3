package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.domain.Etudiant;
import com.example.demo.repository.EtudiantRepository;
@Service
public class EtudiantService {
	@Autowired
	
	private EtudiantRepository repo;
	public List<Etudiant> listAll() {
		return repo.findAll();
	}
	public void save(Etudiant std) {
		repo.save(std);
	}
	public Etudiant get(long id) {
		return repo.findById(id).get();
	}
	public void delete(long id) {
		repo.deleteById(id);
	}

}
