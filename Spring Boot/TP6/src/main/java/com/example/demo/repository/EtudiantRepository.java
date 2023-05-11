package com.example.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.domain.Etudiant;
 
@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long>
{
    @Query(value="select s.id, s.nometd, c.nomcours from etudiant s Inner Join cours c ON s.cours=c.id", nativeQuery=true)

	List<Object[]> findEtudiant();}