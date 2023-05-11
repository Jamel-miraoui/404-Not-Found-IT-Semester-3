package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.domain.Cours;
import com.example.demo.service.CoursService;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.demo.domain.Cours;
import com.example.demo.domain.Etudiant;
import com.example.demo.domain.EtudiantDAO;
import com.example.demo.repository.EtudiantRepository;
import com.example.demo.service.CoursService;
import com.example.demo.service.EtudiantService;


@Controller
@RequestMapping("/")
public class IndexController {

	
	@Autowired
	private CoursService service;
	@Autowired
	private EtudiantService services;
	@Autowired
	private EtudiantRepository etudiantrepository;
	
	@RequestMapping(value = "/etudiant", method = RequestMethod.GET)
	public String viewStudentPage(Model model)
	{
		List<EtudiantDAO> li= new ArrayList<>();
		for (Object[] E : etudiantrepository.findEtudiant() ) {
		EtudiantDAO etudiant =new EtudiantDAO();
		etudiant.setId(Long.parseLong(String.valueOf(E[0])));
		etudiant.setNometd((String)E[1]);
		etudiant.setNomcours((String)E[2]);
		li.add(etudiant);
		}
		model.addAttribute("listeetudiant", li);
		return "etudiant";
		
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	 public String index()
	 {
		return "index";
	 }
	
	@RequestMapping(value = "/cours", method = RequestMethod.GET)
	public String viewHomePage(Model model)
	{
		List<Cours> listcours = service.listAll();
		model.addAttribute("listcours", listcours);
		System.out.print("Get / ");
		return"cours";
	}
		
	}
