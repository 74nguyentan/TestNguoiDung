package edu.poly.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.poly.model.UserModel;
import edu.poly.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/list")
	public String List(ModelMap model) {
		
	List<UserModel> list = (List<UserModel>) userService.findAll();
	model.addAttribute("users" , list);
		
		return "ListUse";
	}
	
	@GetMapping("/add")
	public String add(ModelMap model) {
		model.addAttribute("users", new UserModel());
		return "AddOrEdit";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(ModelMap model, @PathVariable(name = "id") Integer id) {
		Optional<UserModel> opt = userService.findById(id);
		if(opt.isPresent()) {
			model.addAttribute("users" , opt.get());
		}
		else {
			return List(model);
		}
		return "AddOrEdit";
	}
	
	@PostMapping("/saveOrUpdate")
	public String saveOrUpdate(ModelMap model, UserModel users) {
		String message = " new user insertted";
		if (users.getId() != null && users.getId() > 0) {
			message = "the depart updater ";
		}
		userService.save(users);
		model.addAttribute("users", userService.findAll());
		return "ListUse";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(ModelMap model, @PathVariable(name = "id") Integer id) {
		userService.deleteById(id);
		return List(model);
	}
	
	@GetMapping("/find")
	public String find(ModelMap model, @RequestParam(defaultValue = "") String name) {
		List<UserModel> list = userService.findByNameLikeOrderByName(name);
		model.addAttribute("users", list);
		return "ListUse";
	}

}
