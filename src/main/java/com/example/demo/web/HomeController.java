package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.domain.User;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home(Model model)
	{
		model.addAttribute("formData", new User());
		return "index";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String processFormData(User user)
	{
		return "result";
	}
}
