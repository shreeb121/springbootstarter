package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/controllerlevel")
public class Greeting {
	@RequestMapping(value="/methodlevel", method = RequestMethod.GET)
	public String Hello()
	{
		return "<h1>Hello!<h1>";
	}
	


}
