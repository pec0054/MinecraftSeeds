package org.pcsworld.minecraftseeds.controller;

import java.security.Principal;

import javax.validation.Valid;

import org.pcsworld.minecraftseeds.model.Seed;
import org.pcsworld.minecraftseeds.model.User;
import org.pcsworld.minecraftseeds.service.SeedsService;
import org.pcsworld.minecraftseeds.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	@RequestMapping("/login")
	public String showLogin() {
		return "login";
	}
	private UserService userService;

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping("/newuser")
	public String showNewUser(Model model) {
		model.addAttribute("user", new User());
		return "newuser";
	}

	@RequestMapping(value="/createuser", method=RequestMethod.POST)
	public String doUserCreate(Model model, @Valid User user, BindingResult result) {
		System.out.println("Crating User " + user.toString());
		if (result.hasErrors()) {
			return "newuser";
		}
		System.out.println("Crating User " + user.toString());
		userService.create(user);
		return "usercreated";
	}
}
