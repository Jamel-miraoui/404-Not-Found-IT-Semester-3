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
import com.example.demo.service.CoursService;

@Controller
@RequestMapping("/Cours")
public class CoursController {
@Autowired
  private CoursService service;
 
    @GetMapping("/ajoutercours")
    public String ajout(Model model) {
     List<Cours> listcours = service.listAll();
        model.addAttribute("listcours", listcours);
        model.addAttribute("cours", new Cours());
        return "ajoutercours";
    }
 
    @RequestMapping(value = "/enregistrer", method = RequestMethod.POST)
    public String enregistreCours(@ModelAttribute("cours") Cours cours) {
        service.save(cours);
        return "redirect:/cours";
    }
 
    @RequestMapping("/modifier/{id}")
    public ModelAndView showEditCoursPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("ajoutercours");
        Cours cours = service.get(id);
        mav.addObject("cours", cours);
        return mav;
        
    }
    @RequestMapping("/supprimer/{id}")
    public String supprimeCoursPage(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/cours";
    }
}

