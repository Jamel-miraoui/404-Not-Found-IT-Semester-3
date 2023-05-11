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
import com.example.demo.domain.Cours;
import com.example.demo.domain.Etudiant;
import com.example.demo.service.CoursService;
import com.example.demo.service.EtudiantService;

@Controller
@RequestMapping("/Etudiant")
 public class EtudiantController {
@Autowired
    private EtudiantService service;
@Autowired
private CoursService services;
 
    @GetMapping("/ajouteretudiant")
    public String ajout(Model model) {
     List<Etudiant> listetudiant = service.listAll();
     List<Cours> listcours = services.listAll();
     model.addAttribute("listcours", listcours);
     model.addAttribute("listetudiant", listetudiant);
     model.addAttribute("etudiant", new Etudiant());
     return "ajouteretudiant";
    }
    
    
    @RequestMapping(value = "/enregistre", method = RequestMethod.POST)
    public String enregistreetudiant(@ModelAttribute("etudiant") Etudiant std)
    {
        service.save(std);
        return "redirect:/etudiant";
    }
    
   
    @RequestMapping("/modif/{id}")
    public ModelAndView modifetudiantPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("ajouteretudiant");
        List<Cours> listcours = services.listAll();
        Etudiant std = service.get(id);
       mav.addObject("listcours", listcours);
        mav.addObject("etudiant", std);
        return mav;
        }
        
        
    @RequestMapping("/supprime/{id}")
    public String supprimeEtudiantPage(@PathVariable(name = "id") int id) {
        service.delete(id);
        
        return "redirect:/etudiant";
    }
 
}

