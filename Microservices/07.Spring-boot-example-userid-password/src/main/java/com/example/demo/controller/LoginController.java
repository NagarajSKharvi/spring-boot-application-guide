package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginMessage(ModelMap modelMap) {
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String showWelcomePage(ModelMap modelMap, @RequestParam String name, @RequestParam String password) {
		boolean isValidUser = loginService.validateUser(name, password);
		if (!isValidUser) {
			modelMap.put("errorMessage", "Invalid credentials");
			return "login";
		}
		modelMap.put("name", name);
		modelMap.put("password", password);
		return "welcome";
	}	
}
