package com.example.demo.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.domain.Cours;
import com.example.demo.repository.CoursRepository;
 
@Service
public class CoursService
{
@Autowired
    private CoursRepository repo;
public List<Cours> listAll() {
        return repo.findAll();
    }
    
    public void save(Cours cours) {
        repo.save(cours);
    }
    
    public Cours get(long id) {
        return repo.findById(id).get();
          }
    
    public void delete(long id) {
        repo.deleteById(id);
    }
 
}