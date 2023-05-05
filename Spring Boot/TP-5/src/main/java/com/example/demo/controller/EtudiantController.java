package com.example.demo.controller;

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
import com.example.demo.domain.Etudiant;
import com.example.demo.service.EtudiantService;
@Controller
public class EtudiantController {
	@Autowired
	private EtudiantService service;
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		List<Etudiant> listetudiant = service.listAll();
		model.addAttribute("listetudiant", listetudiant);
		return "index";
	}
	@GetMapping("/page1")
    public String add(Model model) {
        model.addAttribute("etudiant", new Etudiant());
        return "page1";
    }
    
    @RequestMapping(value = "/ajouter", method = RequestMethod.POST)
    public String saveEtudiant(@ModelAttribute("etudiant") Etudiant std) {
        service.save(std);
        return "redirect:/";
    }
 
    @RequestMapping("/modifier/{id}")
    public ModelAndView showEditEtudiantPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("page1");
        Etudiant std = service.get(id);
        mav.addObject("etudiant", std);
        return mav;
    }
    
    @RequestMapping("/supprimer/{id}")
    public String deleteetudiant(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/";
    }
}
