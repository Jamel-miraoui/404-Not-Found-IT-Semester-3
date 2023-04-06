package com.example.demo.controller; 
import java.util.ArrayList; 
import java.util.List; 
import org.springframework.stereotype.Controller; 
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.ModelAttribute; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestMethod; 
import com.example.demo.model.User; 
import com.example.demo.model.UserForm; 
@Controller
public class UserController { 
private static List<User> users = new ArrayList<User>(); static { 
users.add(new User("Ahmed", "Salah")); 
users.add(new User("Farah", "Mohamed")); 
} 
@RequestMapping(value = { "/userList" }, method = RequestMethod.GET) public String personList(Model model) { 
model.addAttribute("users", users); 
return "userList"; 
} 
@RequestMapping(value = { "/addUser" }, method = RequestMethod.GET) public String showAddPersonPage(Model model) { 
UserForm userForm = new UserForm(); 
model.addAttribute("userForm", userForm); 
return "addUser"; 
} 
@RequestMapping(value = { "/addUser" }, method = RequestMethod.POST) public String savePerson(Model model, // 
@ModelAttribute("userForm") UserForm userform) {
String firstName = userform.getFirstName(); 
String lastName = userform.getLastName(); 
if (firstName != null && firstName.length() > 0 && lastName != null && lastName.length() > 0) { User newUser = new User(firstName, lastName); 
users.add(newUser); 
return "redirect:/userList"; 
}
return "addUser"; 
} 
}