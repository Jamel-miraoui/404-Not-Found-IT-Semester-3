package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @GetMapping("/")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HttpSession session,
                        RedirectAttributes redirectAttributes) {
        // Authentication logic...

        if (StringUtils.hasText(username) && StringUtils.hasText(password)) {
            // Perform your authentication logic here
            if (username.equals("jamel") && password.equals("jamel")) {
                session.setAttribute("username", username);
                return "redirect:/users";
            }
        }

        redirectAttributes.addFlashAttribute("error", "Invalid username or password");
        return "redirect:/";
    }
}
