package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Controller
public class SearchController {

    private final UserRepository userRepository;

    @Autowired
    public SearchController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/search")
    public String search(@RequestParam("query") String query, Model model) {
        List<User> users = userRepository.findByNameContainingIgnoreCase(query);
        model.addAttribute("users", users);
        return "search-results";
    }
}
